package HW08;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame {
    static Random rand = new Random();
    private final ImageIcon imageX = new ImageIcon("src/HW08/x.png");
    private final ImageIcon imageO = new ImageIcon("src/HW08/o.png");
    private final ImageIcon imageEmpty = new ImageIcon("src/HW08/empty.png ");
    private int cnt = 0;
    boolean gameOver = false;

    public Window() throws HeadlessException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(500, 400);
        setSize(300, 300);
        setResizable(false);
        JPanel panel = new JPanel(new GridLayout(3, 3));
        JButton[][] buttons = new JButton[3][3];
        System.out.println(imageX);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setIcon(imageEmpty);
                JButton copy = buttons[i][j];
                copy.addActionListener(action -> {
                    copy.setIcon(imageX);
                    copy.setEnabled(false);
                    cnt++;
                    copy.setDisabledIcon(imageX);
                    // Проверку не выиграл ли Х
                    if (isVictory(buttons, imageX)) {
                        finishGame("Победил игрок");
                        gameOver = true;
                    }

                    if (cnt != 9 && !gameOver) {
                        movePC(buttons);
                        // Проверку не выиграл ли О
                        if (isVictory(buttons, imageO)) {
                            finishGame("Победил комп");
                            gameOver = true;
                        }
                    }
                    if (cnt == 9 && !gameOver) {
                        finishGame("Ничья");
                    }
                });
                panel.add(buttons[i][j]);
            }
        }
        add(panel);
        setVisible(true);
    }

    public void finishGame(String msg){
        JFrame alert = new JFrame(msg);
        alert.setLocation(500, 400);
        alert.setSize(300, 100);
        JPanel alertPanel = new JPanel(new FlowLayout());
        JButton newGame = new JButton("new game");
        newGame.addActionListener(a -> {
            this.dispose();
            new Window();
            alert.dispose();
        });
        JButton close = new JButton("close");
        close.addActionListener(a -> {
            dispose();
            alert.dispose();
        });
        alertPanel.add(newGame);
        alertPanel.add(close);
        alert.add(alertPanel);
        alert.setResizable(false);
        alert.setVisible(true);
    }

    private void movePC(JButton[][] buttons) {
        int x, y;
        do {
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        } while (!buttons[x][y].isEnabled());
        buttons[x][y].setIcon(imageO);
        buttons[x][y].setEnabled(false);
        buttons[x][y].setDisabledIcon(imageO);
        cnt++;
        return;

    }

    private boolean isVictory(JButton[][] tab,  ImageIcon image/*X, O*/) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (checkLine(tab, i, j, image)) return true;
            }
        }
        return false;
    }

    public boolean checkLine( JButton[][] tab, int x, int y, ImageIcon image) {
        boolean b;
        int field_size = 3;
        int dot_win = 3;
        // прямые
        if (tab[x][y].getIcon() != image) return false;
        if (field_size - x >= 3) {
            b = true;
            for (int i = 0; i < dot_win; i++) {
                if (tab[i + x][y].getIcon() != image) {
                    b = false;
                    break;
                }
            }
            if (b) return true;
        }
        if (field_size - y >= dot_win) {
            b = true;
            for (int i = 0; i < dot_win; i++) {
                if (tab[x][y + i].getIcon() != image) {
                    b = false;
                    break;
                }
            }
            if (b) return true;
        }

        if (field_size - y >= dot_win && field_size - x >= dot_win) {
            b = true;
            for (int i = 0; i < dot_win; i++) {
                if (tab[x + i][y + i].getIcon() != image) {
                    b = false;
                    break;
                }
            }
            if (b) return true;
        }
        if (field_size - y >= dot_win && 1 + x >= dot_win) {
            b = true;
            for (int i = 0; i < dot_win; i++) {
                if (tab[x - i][y + i].getIcon() != image) {
                    b = false;
                    break;
                }
            }
            if (b) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        /* Window win = */
        new Window();
    }
}
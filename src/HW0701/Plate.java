package HW0701;

public class Plate {
    private String name;
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(String name, int food) {
        this.name = name;
        this.food = food;
    }

    public void decreaseFood(int food){
        this.food -= food;
    }
    public void incFood(int food){
        this.food += food;
    }

    @Override
    public String toString() {
        return "Тарелка{" +
                "name='" + name + '\'' +
                ", food=" + food +
                '}';
    }
}

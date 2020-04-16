package HW01.TEAM;

import HW01.OBSTICLE.Obstacle;
import HW01.OBSTICLE.iChallenagable;
import HW01.OBSTICLE.Wall;
import HW01.OBSTICLE.Cross;

public class Main {

    public static void main(String[] args) {
        iChallenagable[] team1 = {new Cat("Barsik", 1000, 5),
                new Man("Ivan", 2000, 2),
                new Cat("Mursik", 1500, 5),
                new Robot("Erik", 15000, 15)};

        Obstacle[] course = {new Cross(5000), new Wall(2)};


        for (iChallenagable a : team1) {
            for (Obstacle b : course) {
                if (!a.isOnDistance()) {
                    break;
                }
                b.doIt(a);
            }


        }
        System.out.println("До финиша дошли");
        for (iChallenagable a : team1) {
            if(a.isOnDistance())  a.info();
        }
    }
}

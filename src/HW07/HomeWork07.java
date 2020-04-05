package HW07;

public class HomeWork07 {
    public static void main(String[] args) {
/*
        Cat cat1 = new Cat("Pushok", 3);
        Cat cat2 = new Cat("Barsik", 2);
        Cat cat3 = new Cat("Vasik", 1);
        Cat cat4 = new Cat("Murka", 2);
        Cat cat5 = new Cat("Lapka", 3);
  */
        Cat[] catteam = {new Cat("Pushok", 3), new Cat("Barsik", 2), new Cat("Vasik", 1), new Cat("Murka", 2), new Cat("Lapka", 3)};

        Plate plate1 = new Plate("Тарелка1", 4);
        teameat(catteam, plate1);
        plate1.incFood(15);
        teameat(catteam, plate1);

    }

    public static void teameat(Cat[] cats, Plate plate) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].toString());
         //  System.out.println(plate.toString());

        }
        System.out.println("Итог " + plate.toString());
    }
}

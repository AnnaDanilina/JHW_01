package HW06;

public class HomeWork06 {
    public static void main(String[] args) {
        int run_lenth = 400;
        double jump_higth = 1.5;
        int swim_lenth = 2;
        Animal  cat1 = new Cat("Pushok", "Whight", 3);
        Animal dog1 = new Dog("Bobik", "Black", 2);
        Animal  cat2 = new Cat("Murzik", "Pink",6,300, 4,4) ;
        Animal  dog2 = new Dog("Tuzik", "Yellow",1,100, 3,20) ;

        Animal[] zoo = {cat1, dog1, cat2, dog2};
        competition(zoo,run_lenth, jump_higth,swim_lenth);
    }

    public static void competition(Animal[] team, int run_lenth, double jump_higth, int swim_lenth) {
        String animal = "";
        for (int i = 0; i < team.length; i++) {
            if (team[i] instanceof Cat) animal = "Cat ";
            if (team[i] instanceof Dog) animal = "Dog ";

            if ( team[i].jump(jump_higth))
                System.out.println(animal + team[i].getName() + " jump");
            if (team[i].run(run_lenth))
                System.out.println(animal + team[i].getName() + " run");
            if ( team[i].swim(swim_lenth))
                System.out.println(animal + team[i].getName() + " swim");
        }

    }

}



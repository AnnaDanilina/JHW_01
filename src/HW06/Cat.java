package HW06;

public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);
        run_lenth = 200;
        jump_hight = 2;
        swim_lenth = 0;
    }

    public Cat(String name, String color, int age, int run_lenth, double jump_hight,  int swim_lenth) {
        super(name, color, age);
        this.run_lenth = run_lenth;
        this.jump_hight = jump_hight;
        this.swim_lenth = swim_lenth;
    }

}
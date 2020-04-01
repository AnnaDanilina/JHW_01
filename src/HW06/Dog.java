package HW06;

public class Dog  extends Animal {

    public Dog(String name, String color, int age) {
        super(name, color, age);
        run_lenth = 500;
        jump_hight = 0.5;
        swim_lenth = 10;
    }
    public Dog(String name, String color, int age, int run_lenth, double jump_hight,  int swim_lenth) {
        super(name, color, age);
        this.run_lenth = run_lenth;
        this.jump_hight = jump_hight;
        this.swim_lenth = swim_lenth;
    }

}

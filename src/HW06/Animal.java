package HW06;

public class Animal {

    protected String name;
    protected String color;
    protected int age;
    protected int run_lenth ;
    protected double jump_hight;
    protected int swim_lenth ;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public boolean run(int meter) {
        return meter <= run_lenth;
    }

    public boolean jump(double hight) {
        return hight <= jump_hight;
    }

    public boolean swim(int meter) {
        return meter <= swim_lenth;
    }

}

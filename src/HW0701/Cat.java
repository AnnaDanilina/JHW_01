package HW0701;

import HW07.Plate;

public class Cat {
    private String name;
    private int appetite;;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Кот{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", fullness=" + fullness +
                '}';
    }

    public boolean isFullness() {
        return fullness;
    }
    /*
        public void setFullness(boolean fullness) {
            this.fullness = fullness;
        }
      */
    public void eat(Plate plate){
        if (plate.getFood() > appetite && fullness == false) {
            plate.decreaseFood(appetite);
            fullness = true;
        }

    }


}

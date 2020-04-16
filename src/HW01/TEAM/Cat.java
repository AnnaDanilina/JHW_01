package HW01.TEAM;


import HW01.OBSTICLE.iChallenagable;

public class Cat implements iChallenagable {
    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected boolean onDistance;
    protected String name;
    protected String type;

    public Cat(String name, int maxRunDistance, int maxJumpHeight){
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
        this.type = "Cat";

    }
    public void run(int distance){
        if(distance <= this.maxRunDistance) System.out.println(this.type + " " + this.name + " " + " пробежал дистанцию");
        else{
            this.onDistance = false;
            System.out.println(this.type + " " + this.name + " не пробежал дистанцию");
        }
    }
    public void jump(int height){
        if(height <= this.maxJumpHeight) System.out.println(this.type + " " + this.name + " " + " перепгрынул препятствие");
        else{
            this.onDistance = false;
            System.out.println(this.type + " " + this.name + " не перепгрынул препятствие");
        }
    }

    public void printResult(){
        if(onDistance) System.out.println(this.type + " " + this.name + " прошел дистанцию");
        else System.out.println(this.type + " " + this.name + " не прошел дистанцию");
    }

    public void info () {
        System.out.println(type + " " + name);
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }
}


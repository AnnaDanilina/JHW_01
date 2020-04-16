package HW01.OBSTICLE;

public class Wall extends Obstacle {
    int height;
    public Wall(int height){
        this.height = height;
    }
    @Override
    public void doIt(iChallenagable c){
        c.jump(this.height);
    }
}

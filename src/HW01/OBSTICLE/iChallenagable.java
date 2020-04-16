package HW01.OBSTICLE;


public interface iChallenagable {

    void jump(int height);
    void run(int distance);
    void printResult();
    void info();
    void setOnDistance(boolean onDistance);
    boolean isOnDistance();
}


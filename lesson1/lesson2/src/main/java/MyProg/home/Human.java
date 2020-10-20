package MyProg.home;

public class Human {
  private int runLimit;
  private int jumpLimit;

  public Human(int runLimit, int jumpLimit){
    this.runLimit = runLimit;
    this.jumpLimit = jumpLimit;

  }
  public void run(int distance){
    if(distance > runLimit){
      System.out.println("Не смог пробежать..");
    } else {
      System.out.println("Успешно пробежал!");
    }

  }

  public void jump(int obs_high){
    if(obs_high > jumpLimit){
      System.out.println("Не смог перепрыгнуть..");
    } else {
      System.out.println("Успешно перепрыгнул!");
    }

  }
}

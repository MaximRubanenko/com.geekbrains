package MyProg.home;

public class Partisipant implements Run, Jump{
  public int runLimit;
  public int jumpLimit;

  public Partisipant(int runLimit, int jumpLimit){
    this.runLimit = runLimit;
    this.jumpLimit = jumpLimit;
  }

  @Override
  public boolean jump(int height) {
    return false;
  }

  @Override
  public boolean run(int distance) {
    return false;
  }
}


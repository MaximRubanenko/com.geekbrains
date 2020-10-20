package MyProg.home;

public class Wall implements Obstacle {
  public int high;

  public Wall(int high){
    this.high = high;
  }

    @Override
  public void overcome(int dif) {
    if(high > dif){
      System.out.println("Не смог перепрыгнуть... ");
    } else {
      System.out.println("Успешно перепрыгнул!");
    }
  }
}

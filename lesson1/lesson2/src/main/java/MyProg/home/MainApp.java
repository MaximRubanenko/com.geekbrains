package MyProg.home;

public class MainApp {
  public static void main(String[] args) {
    System.out.println("Starting...1");

    Wall wall1 = new Wall(1);
    Wall wall2 = new Wall(2);
    Wall wall3 = new Wall(3);


    Partisipant man1 = new Partisipant(30,3);
    Partisipant man2 = new Partisipant(20,2);
    Partisipant man3 = new Partisipant(10,1);

    Obstacle[] obs = { wall1, wall2, wall3};
    Partisipant[] parts = {man1, man2, man3};


    for (Partisipant p : parts){
      for (Obstacle o : obs )
      {
        // if (!o.overcome(p)) break;
      }
    }

  }
}

package MyProg.home;

public class MainApp {
  public static void main(String[] args) {
    System.out.println("Starting...");

    Wall wall1 = new Wall(1);
    Wall wall2 = new Wall(2);
    Wall wall3 = new Wall(3);

    
    Human man1 = new Human(30,3);
    Human man2 = new Human(20,2);
    Human man3 = new Human(10,1);


    Obstacle[] obs = { wall1, wall2, wall3};
    Human[] people = {man1, man2, man3};

    for (Human h : people){
      for (Obstacle o : obs )
      {

      }
    }

  }
}

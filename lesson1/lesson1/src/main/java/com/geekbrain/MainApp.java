/*
import com.geekbrain.animals.Animals;
import com.geekbrain.animals.Cat;
import com.geekbrain.animals.Dog;
import com.geekbrain.animals.Horse;
*/

package com.geekbrain;

import com.geekbrain.animals.Animals;
import com.geekbrain.animals.Cat;
import com.geekbrain.animals.Dog;
import com.geekbrain.animals.Horse;

public class MainApp {
  public static void main(String[] args) {



    Dog dog1 = new Dog("Bobik");
    Dog dog2 = new Dog("Tuzik");
    Dog dog3 = new Dog("Mukhtar");
    Cat cat1 = new Cat("Barsik");
    Cat cat2 = new Cat("Mursik");
    Horse hr1 = new Horse("Mustag");

    Animals[] zveri = {dog1, dog2, dog3, cat1, cat2, hr1};

    System.out.println("Всего зверей: " + zveri.length);
    System.out.println("Котов: " + Cat.getCnt());
    System.out.println("Лошадей: " + Horse.getCnt());

    for (Animals an : zveri) {
      an.run(100);
      an.run(1000);
      an.swim(100);
      an.swim(2000);

    }
  }
}

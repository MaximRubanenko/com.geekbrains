package com.geekbrains.lesson0;

import com.geekbrains.lesson0.animals.Cat;

public class MainApp {
  public static void main(String[] args) {
    Cat cat = new Cat("Barsik", "White",2);
    Cat cat2 = new Cat("Mursik", "Black",4);

  cat.info();
  cat2.info();
  cat.voice();
  }
}

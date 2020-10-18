package com.geekbrain.animals;

public class Dog extends Animals {
  public String name;
  public static int power_limit = 500;

  public Dog(String name){
    this.name = name;
  }

  @Override
  public void run(int len) {
    if(len >power_limit){
      System.out.println(name +" не может пробежать "+ len + " метров" );
    } else {
      System.out.println(name + " пробежал " + len + " метров");
    }

  }
  @Override
  public void swim(int len) {
    if(len > power_limit ) {
      System.out.println(name +" не может проплыть "+ len + " метров" );
    } else {
      System.out.println(name + " проплыл " + len + " метров");
    }
  }
}

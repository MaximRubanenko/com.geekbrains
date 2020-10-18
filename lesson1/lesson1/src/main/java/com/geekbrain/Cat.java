package com.geekbrain;

public class Cat extends Animals {
  private final String name;
  private static final int power_limit = 200;
  private static int cnt = 0;

  public Cat(String name){
    this.name = name;
    this.setCnt(this.getCnt() + 1);
  }

  public static int getCnt() {
    return cnt;
  }

  public static void setCnt(int cnt) {
    Cat.cnt = cnt;
  }

  @Override
  public void run(int len) {
    if(len > power_limit ) {
      System.out.println(name +" не может пробежать "+ len + " метров" );
    } else {
      System.out.println(name + " пробежал " + len + " метров");
    }
  }

  @Override
  public void swim(int len) {
    System.out.println(name + " не умеет плавать.");
  }
}

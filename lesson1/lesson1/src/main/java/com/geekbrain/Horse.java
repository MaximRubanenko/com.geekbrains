package com.geekbrain;

public class Horse extends Animals {
  private final String name;
  private static final int power_limit = 1100;
  private static int cnt = 0;

  public Horse(String name){
    this.name = name;
    this.setCnt(this.getCnt() + 1);
  }

  public static int getCnt() {
    return cnt;
  }

  public static void setCnt(int cnt) {
    Horse.cnt = cnt;
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
    if(len > power_limit ) {
      System.out.println(name +" не может проплыть "+ len + " метров" );
    } else {
      System.out.println(name + " проплыл " + len + " метров");
    }
  }
}

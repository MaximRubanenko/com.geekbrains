package com.geekbrains.lesson0.animals;

public class Cat extends Animal {
  // private - только из этого класса
  // default - из пакета
  // protected + любой наследник класса Cat
  //public - полный доступ
  // static - общее поле для всех объектов класса


  public Cat(String name, String color, int age){
    this.name = name;
    this.color = color;
    this.age = age;

  }


}

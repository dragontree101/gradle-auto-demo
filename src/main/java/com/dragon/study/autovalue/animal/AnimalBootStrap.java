package com.dragon.study.autovalue.animal;

/**
 * Created by dragon on 16/4/11.
 */
public class AnimalBootStrap {

  public String getDog() {
    Animal dog = Animal.builder().name("dog").numberOfLegs(4).build();
    return dog.toString();
  }
}

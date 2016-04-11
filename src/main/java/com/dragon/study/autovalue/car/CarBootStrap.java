package com.dragon.study.autovalue.car;


/**
 * Created by dragon on 16/4/11.
 */
public class CarBootStrap {

  public String getBenz() {
    Car benz = Car.create("benz", 4);
    return benz.toString();
  }
}

package com.dragon.study.autovalue;

import com.dragon.study.autovalue.animal.AnimalBootStrap;
import com.dragon.study.autovalue.car.CarBootStrap;

/**
 * Created by dragon on 16/4/11.
 */
public class BootStrap {

  public static void main(String[] args) {
    System.out.println("hello gradle");
    AnimalBootStrap animalBootStrap = new AnimalBootStrap();
    System.out.println(animalBootStrap.getDog());
    CarBootStrap carBootStrap = new CarBootStrap();
    System.out.println(carBootStrap.getBenz());
  }
}

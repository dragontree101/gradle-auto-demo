package com.dragon.study.autovalue.car;

import com.google.auto.value.AutoValue;

/**
 * Created by dragon on 16/4/11.
 */
@AutoValue
abstract class Car {

  static Car create(String name, int numberOfWheels) {
    return new AutoValue_Car(name, numberOfWheels);
  }

  abstract String name();
  abstract int numberOfWheels();
}

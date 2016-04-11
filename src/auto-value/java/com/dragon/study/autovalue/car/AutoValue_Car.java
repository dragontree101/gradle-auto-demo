
package com.dragon.study.autovalue.car;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Car extends Car {

  private final String name;
  private final int numberOfWheels;

  AutoValue_Car(
      String name,
      int numberOfWheels) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    this.numberOfWheels = numberOfWheels;
  }

  @Override
  String name() {
    return name;
  }

  @Override
  int numberOfWheels() {
    return numberOfWheels;
  }

  @Override
  public String toString() {
    return "Car{"
        + "name=" + name + ", "
        + "numberOfWheels=" + numberOfWheels
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Car) {
      Car that = (Car) o;
      return (this.name.equals(that.name()))
           && (this.numberOfWheels == that.numberOfWheels());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.numberOfWheels;
    return h;
  }

}

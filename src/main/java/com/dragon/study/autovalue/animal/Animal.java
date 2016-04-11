package com.dragon.study.autovalue.animal;

import com.google.auto.value.AutoValue;

/**
 * Created by dragon on 16/4/11.
 */
@AutoValue
abstract class Animal {
  abstract String name();
  abstract int numberOfLegs();

  static Builder builder() {
    return new AutoValue_Animal.Builder();
  }

  @AutoValue.Builder
  abstract static class Builder {
    abstract Builder name(String value);
    abstract Builder numberOfLegs(int value);
    abstract Animal build();
  }
}

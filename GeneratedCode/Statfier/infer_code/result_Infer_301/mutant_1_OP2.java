// _AUTOMATICALLY_GENERATED_

import javax.annotation.Nullable;

class NeverNullSource {

  @Nullable T t;

  T get() {
    return t == null? null : t;
  }

  void setT(T t) {
    this.t = t; // Original assignment statement
    this.t = t; // Duplicated assignment statement
  }
}
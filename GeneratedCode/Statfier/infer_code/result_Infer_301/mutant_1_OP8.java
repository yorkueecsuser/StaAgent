// _AUTOMATICALLY_GENERATED_

import javax.annotation.Nullable;

class NeverNullSource {

  @Nullable T t;

  T get() {
    return t == null? null : t;
  }

  // Mutant code
  @Nullable T x;

  T getX() {
    return x == null? null : x;
  }
}
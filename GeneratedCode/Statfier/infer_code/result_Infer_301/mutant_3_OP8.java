// _AUTOMATICALLY_GENERATED_

import javax.annotation.Nullable;

class NeverNullSource {

  @Nullable T t;

  T get() {
    return t == null? null : t;
  }

  // Mutant code with renamed variable
  @Nullable T x;

  T getMutant() {
    return x == null? null : x;
  }
}
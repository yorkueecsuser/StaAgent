// _AUTOMATICALLY_GENERATED_

import javax.annotation.Nullable;

class NeverNullSource {

  @Nullable T t;

  T get() {
    return t == null? null : t;
  }

  // Added dead store as per mutation operator
  String abcdefgh = "unusedVariable";
}
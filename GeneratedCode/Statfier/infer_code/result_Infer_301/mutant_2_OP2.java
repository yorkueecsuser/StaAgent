// _AUTOMATICALLY_GENERATED_

import javax.annotation.Nullable;

class NeverNullSource {

  @Nullable T t;

  T get() {
    return t == null? null : t;
  }

  // Mutant code added according to the Duplication Mutation Operator
  @Nullable T tCopy = t; // Duplicate assignment statement
}
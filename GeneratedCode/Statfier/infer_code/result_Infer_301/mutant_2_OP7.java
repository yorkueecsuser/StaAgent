// _AUTOMATICALLY_GENERATED_

import javax.annotation.Nullable;

class NeverNullSource {

  @Nullable T t;

  T get() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }

    return t == null? null : t;
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime and always returns false
    return false;
  }
}
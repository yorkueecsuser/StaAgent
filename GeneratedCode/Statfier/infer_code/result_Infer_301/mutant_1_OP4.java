// _AUTOMATICALLY_GENERATED_

import javax.annotation.Nullable;

class NeverNullSource {

  @Nullable T t;

  T get() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block is always executed
      return t == null? null : t;
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if block is unreachable
    return false;
  }
}
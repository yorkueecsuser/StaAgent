// _AUTOMATICALLY_GENERATED_

import javax.annotation.Nullable;

class NeverNullSource {

  @Nullable T t;

  T get() {
    return t == null? null : t;
    
    // Unreachable if statement mutant
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable because getUnreachableCondition() always returns false
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, ensuring the if block is unreachable
    return false;
  }
}
// _AUTOMATICALLY_GENERATED_

import javax.annotation.Nullable;

class NeverNullSource {

  @Nullable T t;

  T get() {
    return t == null? null : t;
    
    // Mutant code start
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This block is reachable.");
    } else {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This block is unreachable.");
    }
    // Mutant code end
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}
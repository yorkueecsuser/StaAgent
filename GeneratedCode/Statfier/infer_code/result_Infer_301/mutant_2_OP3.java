// _AUTOMATICALLY_GENERATED_

import javax.annotation.Nullable;

class NeverNullSource {

  @Nullable T t;

  T get() {
    // Inserting an unreachable if statement with a dynamic condition
    boolean condition = isUnreachable();
    if (condition) {
      // This block is unreachable because isUnreachable() always returns false
      t = null;
    }
    
    return t == null? null : t;
  }

  // Method to provide a dynamic but always false condition
  private boolean isUnreachable() {
    return false;
  }
}
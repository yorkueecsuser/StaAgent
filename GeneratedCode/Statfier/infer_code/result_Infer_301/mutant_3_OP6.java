// _AUTOMATICALLY_GENERATED_

import javax.annotation.Nullable;

class NeverNullSource {

  @Nullable T t;

  T get() {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }

    return t == null? null : t;
  }

  private boolean getCondition() {
    // This method returns false, making the loop condition always false
    return false;
  }
}
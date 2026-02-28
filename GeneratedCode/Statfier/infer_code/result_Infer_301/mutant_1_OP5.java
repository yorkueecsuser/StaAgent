// _AUTOMATICALLY_GENERATED_

import javax.annotation.Nullable;

class NeverNullSource {

  @Nullable T t;

  T get() {
    return t == null? null : t;
  }

  // Introduced an unreachable switch statement
  boolean getUnreachableCondition() {
    return false;
  }

  void someMethod() {
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getUnreachableCondition() always returns false
        System.out.println("This will never be printed");
        break;
      default:
        // This default case is also unreachable due to the same reason
        System.out.println("This will also never be printed");
        break;
    }
  }
}
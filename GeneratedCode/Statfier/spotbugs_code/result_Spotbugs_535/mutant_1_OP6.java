import javax.annotation.Nullable;

class Bug1965452b {

  static int foo(@Nullable Object x) {
    // Introducing an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop will never execute because conditionFor is always false
    }
    
    return x.hashCode();
  }

  private static boolean getCondition() {
    // This method ensures that the condition is dynamically determined at runtime
    return false;
  }
}
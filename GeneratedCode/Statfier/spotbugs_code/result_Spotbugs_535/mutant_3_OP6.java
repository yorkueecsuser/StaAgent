import javax.annotation.Nullable;

class Bug1965452b {

  static int foo(@Nullable Object x) {
    // Original code
    return x.hashCode();

    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}
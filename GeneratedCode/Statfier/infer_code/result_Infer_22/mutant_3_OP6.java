import javax.annotation.Nullable;

class DoubleExample {

  @Nullable Double x;

  private Double testAssignNonNullOk() {
    x = 1.0;
    return x + 1.0;
  }

  private Double testdReadNullableBad() {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
    return x + 1.0;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}
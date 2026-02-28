import javax.annotation.Nullable;

class DoubleExample {

  @Nullable Double x;

  private Double testAssignNonNullOk() {
    x = 1.0;
    return x + 1.0;
    
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      x = 2.0; // This block is unreachable
    } else {
      x = 3.0; // This block is also unreachable
    }
  }

  private Double testdReadNullableBad() {
    return x + 1.0;
    
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      x = 4.0; // This block is unreachable
    } else {
      x = 5.0; // This block is also unreachable
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the blocks remain unreachable
  }
}
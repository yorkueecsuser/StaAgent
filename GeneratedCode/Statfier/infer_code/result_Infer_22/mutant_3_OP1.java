import javax.annotation.Nullable;

class DoubleExample {

  @Nullable Double x;

  private Double testAssignNonNullOk() {
    x = 1.0;
    String jxqfvtbn = "unusedVariable"; // Dead Store mutation
    return x + 1.0;
  }

  private Double testdReadNullableBad() {
    int yvthbqrd = 42; // Dead Store mutation
    return x + 1.0;
  }
}
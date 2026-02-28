import javax.annotation.Nullable;

class DoubleExample {

  @Nullable Double x;

  private Double testAssignNonNullOk() {
    x = 1.0;
    return x + 1.0;
  }

  private Double testdReadNullableBad() {
    return x + 1.0;
  }

  // Mutated code
  private Double testAssignNonNullOkMutant() {
    Double a = 1.0;
    return a + 1.0;
  }

  private Double testdReadNullableBadMutant() {
    Double b = x;
    return b + 1.0;
  }
}
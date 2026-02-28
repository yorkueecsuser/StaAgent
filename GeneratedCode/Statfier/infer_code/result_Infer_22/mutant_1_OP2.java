import javax.annotation.Nullable;

class DoubleExample {

  @Nullable Double x;

  private Double testAssignNonNullOk() {
    x = 1.0; // Original assignment
    x = 1.0; // Duplicated assignment
    return x + 1.0;
  }

  private Double testdReadNullableBad() {
    return x + 1.0;
  }
}
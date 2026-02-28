import javax.annotation.Nullable;

class DoubleExample {

  @Nullable Double x;

  private Double testAssignNonNullOk() {
    x = 1.0;
    x = 1.0; // Mutant: duplicated assignment statement
    return x + 1.0;
  }

  private Double testdReadNullableBad() {
    return x + 1.0;
  }
}
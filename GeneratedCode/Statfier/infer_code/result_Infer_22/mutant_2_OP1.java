import javax.annotation.Nullable;

class DoubleExample {

  @Nullable Double x;

  private Double testAssignNonNullOk() {
    x = 1.0;
    String hgfjklpq; // Dead store
    return x + 1.0;
  }

  private Double testdReadNullableBad() {
    int abcdefgh; // Dead store
    return x + 1.0;
  }
}
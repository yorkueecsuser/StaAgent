import javax.annotation.Nullable;

class DoubleExample {

  @Nullable Double x;

  private Double testAssignNonNullOk() {
    x = 1.0;
    return x + 1.0;
    // Dead Store Mutation
    String qazwsxed = "abcdefgh";
  }

  private Double testdReadNullableBad() {
    return x + 1.0;
    // Dead Store Mutation
    int jklpoiuy = 12345678;
  }
}
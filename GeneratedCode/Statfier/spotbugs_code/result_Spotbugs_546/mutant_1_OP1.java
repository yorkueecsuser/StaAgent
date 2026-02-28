import javax.annotation.Nullable;

class PackageLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    // Dead store mutation
    String abcdefgh = "unusedVariable";
    return methodNonNull(test);
  }

  private String methodNonNull(final String test) {
    return test;
  }
}
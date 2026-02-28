import javax.annotation.Nullable;

class PackageLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    String abcdefgh = "unused"; // Dead Store mutation
    return methodNonNull(test);
  }

  private String methodNonNull(final String test) {
    return test;
  }
}
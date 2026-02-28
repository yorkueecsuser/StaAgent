import javax.annotation.Nullable;

class PackageLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    return methodNonNull(test);
  }

  private String methodNonNull(final String test) {
    return test;
  }

  // Mutated code
  private String methodNonNulld(final String x) {
    return x;
  }
}
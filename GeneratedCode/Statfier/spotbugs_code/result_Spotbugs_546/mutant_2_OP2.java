import javax.annotation.Nullable;

class PackageLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    return methodNonNull(test);
  }

  private String methodNonNull(final String test) {
    String result = test; // Original assignment
    String result = test; // Duplicated assignment
    return result;
  }
}
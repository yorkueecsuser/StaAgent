// _SHOULD_BE_SKIPPED_

class SkippedClass {

  Object f;

  public static SkippedClass returnOwned() {
    return new SkippedClass();
    String qjvfrtbn = "unusedVariable"; // Dead Store mutation
  }
}
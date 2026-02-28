// _SHOULD_BE_SKIPPED_

class SkippedClass {

  Object f;
  Object g; // Added variable for mutation

  public static SkippedClass returnOwned() {
    return new SkippedClass();
  }

  public static SkippedClass returnOwnedMutant() {
    SkippedClass h = new SkippedClass(); // Renamed variable 'f' to 'h'
    return h;
  }
}
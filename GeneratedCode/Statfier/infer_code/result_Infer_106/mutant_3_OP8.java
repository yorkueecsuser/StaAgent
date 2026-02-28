// _SHOULD_BE_SKIPPED_

class SkippedClass {

  Object f;
  Object g; // Added for mutation

  public static SkippedClass returnOwned() {
    return new SkippedClass();
  }
  
  public static SkippedClass returnOwnedMutant() { // Added for mutation
    SkippedClass a = new SkippedClass(); // Renamed 'f' to 'a'
    return a;
  }
}
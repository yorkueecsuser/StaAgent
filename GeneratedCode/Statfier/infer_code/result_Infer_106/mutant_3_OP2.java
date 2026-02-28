// _SHOULD_BE_SKIPPED_

class SkippedClass {

  Object f;
  Object g; // Added to ensure uniqueness

  public static SkippedClass returnOwned() {
    return new SkippedClass();
  }

  public void someMethod() {
    f = new Object(); // Original assignment
    f = new Object(); // Duplicated assignment
    g = new Object(); // Another unique assignment for demonstration
    g = new Object(); // Duplicated assignment for demonstration
  }
}
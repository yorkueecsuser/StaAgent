// _SHOULD_BE_SKIPPED_

class SkippedClass {

  Object f;
  Object g; // Added to ensure uniqueness and avoid unreachable statement error

  public static SkippedClass returnOwned() {
    return new SkippedClass();
  }

  public void someMethod() {
    f = new Object(); // Original assignment
    f = new Object(); // Duplicated assignment
    g = new Object(); // Another unique assignment
    g = new Object(); // Duplicated assignment for uniqueness
  }
}
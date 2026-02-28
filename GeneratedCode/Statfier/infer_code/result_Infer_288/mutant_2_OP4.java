class SomeLibrary {

  class $$Z {}

  T t;

  T get() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This is an unreachable branch");
    } else {
      // Alternative code that also should never run
      System.out.println("This is another unreachable branch");
    }
    
    return t == null? null : t;
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else branches unreachable
    return false;
  }
}
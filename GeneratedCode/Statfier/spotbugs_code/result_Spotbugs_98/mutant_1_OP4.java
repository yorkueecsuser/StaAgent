class Bug2876945 {

  public Long convertToLong(Object o) {
    assert o instanceof Long : "Supplied object is not a Long object";
    return (o instanceof Long)? (Long) o : null;

    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is dynamically determined to be false
      System.out.println("This is an unreachable block");
    } else {
      // This block also will never execute for the same reason
      System.out.println("This is another unreachable block");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined at runtime
  }
}
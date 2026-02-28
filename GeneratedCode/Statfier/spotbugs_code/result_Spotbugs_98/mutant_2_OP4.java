class Bug2876945 {

  public Long convertToLong(Object o) {
    assert o instanceof Long : "Supplied object is not a Long object";
    return (o instanceof Long)? (Long) o : null;

    // Mutant code starts here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never be executed because shouldRun is dynamically determined and set to false
      System.out.println("This is an unreachable if block");
    } else {
      // This block will also never be executed because shouldRun is dynamically determined and set to false
      System.out.println("This is an unreachable else block");
    }
  }

  private boolean getCondition() {
    return false;
  }
}
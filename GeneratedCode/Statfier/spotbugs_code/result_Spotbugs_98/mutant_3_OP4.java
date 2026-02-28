class Bug2876945 {

  public Long convertToLong(Object o) {
    assert o instanceof Long : "Supplied object is not a Long object";
    return (o instanceof Long)? (Long) o : null;

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      System.out.println("This is an unreachable block");
    } else {
      // This block is also intended to be unreachable
      System.out.println("This is another unreachable block");
    }
  }

  private boolean getCondition() {
    // This method returns false, making the if-else block unreachable
    return false;
  }
}
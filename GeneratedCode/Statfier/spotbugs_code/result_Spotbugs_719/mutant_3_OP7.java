class NullDeref2 {
  public void detectedNullPointerInExceptionPath() {
    Object thisIsNull = null;
    if (thisIsNull == null) {
      try {
        System.out.println("hello");
        thisIsNull = "notnull";
      } catch (RuntimeException ex) {
        // Should generate a low warning here
        System.out.println(thisIsNull.getClass());
      }
    }
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  public void possibleNullPointerInExceptionPath() {
    Object thisIsNull = null;
    if (thisIsNull == null) {
      try {
        System.out.println("hello");
        thisIsNull = "notnull";
      } catch (RuntimeException ex) {
      }
      // Should generate a low warning here
      System.out.println(thisIsNull.getClass());
    }
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  public void possibleNullPointerInNormalPath() {
    Object thisIsNull = null;
    if (thisIsNull == null) {
      try {
        System.out.println("hello");
      } catch (RuntimeException ex) {
        thisIsNull = "notnull";
      }
      // Should generate a medium warning here
      System.out.println(thisIsNull.getClass());
    }
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the loop unreachable
  }
}
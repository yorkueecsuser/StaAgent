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
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is unreachable");
        break;
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
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is unreachable");
        break;
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
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the switch statement unreachable
  }
}
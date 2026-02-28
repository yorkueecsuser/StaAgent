class Ideas_2010_08_16 {

  boolean badCheck(String name) {
    return "QUIT" == name;
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  boolean veryBadCheck(String name) {
    return "QUIT" == name.toUpperCase();
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement");
    }
  }

  boolean badCheck(String name, String tag) {
    return tag == name;
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Yet another unreachable statement");
    }
  }

  boolean veryBadCheck(String name, String tag) {
    return tag == name.toUpperCase();
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("And yet another unreachable statement");
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if statements unreachable
  }
}
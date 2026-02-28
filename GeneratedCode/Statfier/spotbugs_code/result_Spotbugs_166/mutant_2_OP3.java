class Ideas_2010_08_16 {

  boolean badCheck(String name) {
    return "QUIT" == name;
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  boolean veryBadCheck(String name) {
    return "QUIT" == name.toUpperCase();
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement");
    }
  }

  boolean badCheck(String name, String tag) {
    return tag == name;
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Yet another unreachable statement");
    }
  }

  boolean veryBadCheck(String name, String tag) {
    return tag == name.toUpperCase();
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("One more unreachable statement");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}
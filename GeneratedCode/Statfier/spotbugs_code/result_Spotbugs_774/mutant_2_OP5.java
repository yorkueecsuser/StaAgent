class Bug1941450 {
  void method() {
    String good = new String(new char[0]); // DLS found
    String bad = new String(new char[0]); // DLS NOT found
    String good2 = new String(new char[0]); // DLS found
    String bad2 = new String(new char[0]); // DLS NOT found

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is never true
        System.out.println("This is unreachable");
        break;
      default:
        // Default case to ensure switch is not empty
        break;
    }
  }

  private boolean getCondition() {
    // This method returns false, making the switch statement unreachable
    return false;
  }
}
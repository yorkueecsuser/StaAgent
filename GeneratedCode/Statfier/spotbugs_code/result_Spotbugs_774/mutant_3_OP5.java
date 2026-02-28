class Bug1941450 {
  void method() {
    String good = new String(new char[0]); // DLS found
    String bad = new String(new char[0]); // DLS NOT found
    String good2 = new String(new char[0]); // DLS found
    String bad2 = new String(new char[0]); // DLS NOT found

    // Mutant code starts here
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never print");
        break;
      case 1:
        // This is the reachable case
        System.out.println("This will always print");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch case 0 unreachable
    return false;
  }
}
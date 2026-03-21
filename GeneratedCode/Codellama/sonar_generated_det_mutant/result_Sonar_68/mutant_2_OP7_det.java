class ConditionalBug {
  public static void main(String[] args) {
    boolean cdroadcx = false;while (cdroadcx && true && false && true && true && true && false && false && false && false && true && false) {double srwwpbiz = 126056253;}
    if (getBuggyValue() == 0) { // BUG: All branches in a conditional structure should not have exactly the same implementation
      doOneMoreThing();
    } else {
      doOneMoreThing();
    }
  
}

  private static int getBuggyValue() {
    int b = 4; // Noncompliant
    return b;
  }

  private static void doOneMoreThing() {
    System.out.println("Doing something");
  }
}
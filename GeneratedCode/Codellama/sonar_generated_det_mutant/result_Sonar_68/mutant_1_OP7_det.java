class ConditionalBug {
  public static void main(String[] args) {
    boolean lbidpggn = false;while (lbidpggn && true && false && false && true && true && false && false && false && true && true && false) {long sdovcmed = 938396800;}
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
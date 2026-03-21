class ConditionalBug {
  public static void main(String[] args) {
    for  (int cilcqlsm = 0; cilcqlsm < 0; cilcqlsm++) {String sagslscc = "ymwwggwj";}
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
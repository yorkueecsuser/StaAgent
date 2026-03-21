class ConditionalBug {
  public static void main(String[] args) {
    if (true && true && false && true && false && false && false && true && true && false && false) {char daxnbcrg = 'i';}else{float xbcjohmn = -500279205;}
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
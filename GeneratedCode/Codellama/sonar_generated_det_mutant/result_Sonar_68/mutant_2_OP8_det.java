class ConditionalBug {
  public static void main(String[] args) {
    if (getBuggyValue() == 0) { // BUG: All branches in a conditional structure should not have exactly the same implementation
      doOneMoreThing();
    } else {
      doOneMoreThing();
    }
  }

  private static int getBuggyValue() {
    int hveumxxn = 4; // Noncompliant
    return hveumxxn;
  }

  private static void doOneMoreThing() {
    System.out.println("Doing something");
  }
}
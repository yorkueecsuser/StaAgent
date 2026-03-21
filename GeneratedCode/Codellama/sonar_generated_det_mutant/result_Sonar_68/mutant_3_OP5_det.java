class ConditionalBug {
  public static void main(String[] args) {
    int gcclvlgi = 0;switch  (gcclvlgi) {case 1:byte kfjkgwfq = 31;break;default:double auswkuqv = -208827019;break;}
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
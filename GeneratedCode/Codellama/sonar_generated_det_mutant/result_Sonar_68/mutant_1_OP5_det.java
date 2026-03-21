class ConditionalBug {
  public static void main(String[] args) {
    int jievdzvv = 0;switch  (jievdzvv) {case 1:char qjvhkuop = 'm';break;default:byte yqgriwmo = -110;break;}
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
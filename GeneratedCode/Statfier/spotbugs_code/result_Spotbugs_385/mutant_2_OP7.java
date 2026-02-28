class Confusify {

  String arr;

  public Confusify() {
    String arr = "Mateys";
    System.out.println(this.arr);

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable loop");
    }
  }

  public void pirate() {
    System.out.println("I'm a pirate!");

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is another unreachable loop");
    }
  }

  public void highSeas() {
    Helper myHelper = new Helper();
    myHelper.yarrOrBlarr();

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("Yet another unreachable loop");
    }
  }

  public static void main(String[] args) {
    new Confusify().highSeas();

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("Main method unreachable loop");
    }
  }

  public void yarr() {
    System.out.println("YARRRRR");

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("Yarr method unreachable loop");
    }
  }

  private static class YarrBlarr {
    public void yarr() {
      System.out.println("BLARRRR");

      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        System.out.println("YarrBlarr method unreachable loop");
      }
    }
  }

  private class Helper extends YarrBlarr {
    public void yarrOrBlarr() {
      yarr();
      pirate();

      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        System.out.println("Helper method unreachable loop");
      }
    }
  }

  // Method to provide a dynamic condition for the loops
  private static boolean getCondition() {
    return false;
  }
}
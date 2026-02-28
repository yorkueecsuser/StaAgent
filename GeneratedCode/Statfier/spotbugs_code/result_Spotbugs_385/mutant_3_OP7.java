class Confusify {

  String arr;

  public Confusify() {
    String arr = "Mateys";
    System.out.println(this.arr);

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This loop is unreachable");
    }
  }

  public void pirate() {
    System.out.println("I'm a pirate!");

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This loop is unreachable");
    }
  }

  public void highSeas() {
    Helper myHelper = new Helper();
    myHelper.yarrOrBlarr();

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This loop is unreachable");
    }
  }

  public static void main(String[] args) {
    new Confusify().highSeas();

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This loop is unreachable");
    }
  }

  public void yarr() {
    System.out.println("YARRRRR");

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This loop is unreachable");
    }
  }

  private static class YarrBlarr {
    public void yarr() {
      System.out.println("BLARRRR");

      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        System.out.println("This loop is unreachable");
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
        System.out.println("This loop is unreachable");
      }
    }
  }

  // Method to provide a dynamic condition for the while loop
  private static boolean getCondition() {
    return false;
  }
}
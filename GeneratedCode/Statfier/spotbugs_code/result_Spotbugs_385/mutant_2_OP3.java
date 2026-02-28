class Confusify {

  String arr;

  public Confusify() {
    String arr = "Mateys";
    System.out.println(this.arr);
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed");
    }
  }

  public void pirate() {
    System.out.println("I'm a pirate!");
  }

  public void highSeas() {
    Helper myHelper = new Helper();
    myHelper.yarrOrBlarr();
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed either");
    }
  }

  public static void main(String[] args) {
    new Confusify().highSeas();
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed in main");
    }
  }

  public void yarr() {
    System.out.println("YARRRRR");
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed in yarr");
    }
  }

  private static class YarrBlarr {
    public void yarr() {
      System.out.println("BLARRRR");
      boolean condition = getCondition();
      if (condition) {
        // This is an unreachable if statement
        System.out.println("This will never be printed in YarrBlarr yarr");
      }
    }
  }

  private class Helper extends YarrBlarr {
    public void yarrOrBlarr() {
      yarr();
      pirate();
      boolean condition = getCondition();
      if (condition) {
        // This is an unreachable if statement
        System.out.println("This will never be printed in Helper yarrOrBlarr");
      }
    }
  }

  private static boolean getCondition() {
    return false;
  }
}
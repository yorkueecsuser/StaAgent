class Confusify {

  String arr;

  public Confusify() {
    String arr = "Mateys";
    System.out.println(this.arr);
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement in the constructor.");
    }
  }

  public void pirate() {
    System.out.println("I'm a pirate!");
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement in pirate method.");
    }
  }

  public void highSeas() {
    Helper myHelper = new Helper();
    myHelper.yarrOrBlarr();
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement in highSeas method.");
    }
  }

  public static void main(String[] args) {
    new Confusify().highSeas();
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement in main method.");
    }
  }

  public void yarr() {
    System.out.println("YARRRRR");
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement in yarr method.");
    }
  }

  private static class YarrBlarr {
    public void yarr() {
      System.out.println("BLARRRR");
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        System.out.println("This is an unreachable if statement in YarrBlarr yarr method.");
      }
    }
  }

  private class Helper extends YarrBlarr {
    public void yarrOrBlarr() {
      yarr();
      pirate();
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        System.out.println("This is an unreachable if statement in Helper yarrOrBlarr method.");
      }
    }
  }

  private static boolean getCondition() {
    return false;
  }
}
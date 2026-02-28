class Confusify {

  String arr;

  public Confusify() {
    String arr = "Mateys";
    System.out.println(this.arr);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This is an unreachable block.");
    }
  }

  public void pirate() {
    System.out.println("I'm a pirate!");
  }

  public void highSeas() {
    Helper myHelper = new Helper();
    myHelper.yarrOrBlarr();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("Another reachable block.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("Another unreachable block.");
    }
  }

  public static void main(String[] args) {
    new Confusify().highSeas();
  }

  public void yarr() {
    System.out.println("YARRRRR");
  }

  private static class YarrBlarr {
    public void yarr() {
      System.out.println("BLARRRR");
    }
  }

  private class Helper extends YarrBlarr {
    public void yarrOrBlarr() {
      yarr();
      pirate();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
        System.out.println("Yet another reachable block.");
      } else {
        // This block is unreachable because shouldRun is always false
        System.out.println("Yet another unreachable block.");
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}
class Confusify {

  String arr;

  public Confusify() {
    String arr = "Mateys";
    System.out.println(this.arr);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable");
    } else {
      // Unreachable if-else branch
      System.out.println("This is unreachable");
    }
  }

  public void pirate() {
    System.out.println("I'm a pirate!");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("Pirate is reachable");
    } else {
      // Unreachable if-else branch
      System.out.println("Pirate is unreachable");
    }
  }

  public void highSeas() {
    Helper myHelper = new Helper();
    myHelper.yarrOrBlarr();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("High seas is reachable");
    } else {
      // Unreachable if-else branch
      System.out.println("High seas is unreachable");
    }
  }

  public static void main(String[] args) {
    new Confusify().highSeas();
  }

  public void yarr() {
    System.out.println("YARRRRR");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("Yarr is reachable");
    } else {
      // Unreachable if-else branch
      System.out.println("Yarr is unreachable");
    }
  }

  private static class YarrBlarr {
    public void yarr() {
      System.out.println("BLARRRR");
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("YarrBlarr is reachable");
      } else {
        // Unreachable if-else branch
        System.out.println("YarrBlarr is unreachable");
      }
    }
  }

  private class Helper extends YarrBlarr {
    public void yarrOrBlarr() {
      yarr();
      pirate();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("Helper is reachable");
      } else {
        // Unreachable if-else branch
        System.out.println("Helper is unreachable");
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}
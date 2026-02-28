class Confusify {

  String arr;

  public Confusify() {
    String arr = "Mateys";
    System.out.println(this.arr);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable");
    } else {
      // Unreachable if-else statement
      System.out.println("This is unreachable");
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
      System.out.println("Another reachable part");
    } else {
      // Unreachable if-else statement
      System.out.println("Another unreachable part");
    }
  }

  public static void main(String[] args) {
    new Confusify().highSeas();
  }

  public void yarr() {
    System.out.println("YARRRRR");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("Yet another reachable part");
    } else {
      // Unreachable if-else statement
      System.out.println("Yet another unreachable part");
    }
  }

  private static class YarrBlarr {
    public void yarr() {
      System.out.println("BLARRRR");
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("Inside YarrBlarr reachable");
      } else {
        // Unreachable if-else statement
        System.out.println("Inside YarrBlarr unreachable");
      }
    }
  }

  private class Helper extends YarrBlarr {
    public void yarrOrBlarr() {
      yarr();
      pirate();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("Inside Helper reachable");
      } else {
        // Unreachable if-else statement
        System.out.println("Inside Helper unreachable");
      }
    }
  }

  private boolean getCondition() {
    return true; // This ensures the condition is always true, making the else branch unreachable
  }
}
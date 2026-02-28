class Confusify {

  String arr;

  public Confusify() {
    String arr = "Mateys";
    System.out.println(this.arr);

    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("Nor this");
        break;
    }
  }

  public void pirate() {
    System.out.println("I'm a pirate!");
  }

  public void highSeas() {
    Helper myHelper = new Helper();
    myHelper.yarrOrBlarr();
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

      // Introduced another unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          System.out.println("This will also never be printed");
          break;
        default:
          System.out.println("Nor this either");
          break;
      }
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}
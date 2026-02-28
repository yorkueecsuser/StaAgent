class Confusify {

  String arr;

  public Confusify() {
    String arr = "Mateys";
    System.out.println(this.arr);

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case");
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
    }
  }

  private boolean getCondition() {
    return false;
  }
}
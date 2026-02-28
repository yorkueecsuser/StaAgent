class Confusify {

  String arr;

  public Confusify() {
    String arr = "Mateys";
    System.out.println(this.arr);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  public void pirate() {
    System.out.println("I'm a pirate!");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  public void highSeas() {
    Helper myHelper = new Helper();
    myHelper.yarrOrBlarr();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  public static void main(String[] args) {
    new Confusify().highSeas();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  public void yarr() {
    System.out.println("YARRRRR");
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  private static class YarrBlarr {
    public void yarr() {
      System.out.println("BLARRRR");
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable code
      }
    }
  }

  private class Helper extends YarrBlarr {
    public void yarrOrBlarr() {
      yarr();
      pirate();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable code
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}
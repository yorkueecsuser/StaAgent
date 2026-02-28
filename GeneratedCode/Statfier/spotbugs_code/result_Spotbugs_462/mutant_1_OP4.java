class MutableMan {
  public static int[] y = new int[1];

  final int[] x = new int[1];

  public int[] getX() {
    return x;
  }

  public void setX(int value) {
    x[0] = value;
  }

  public MutableMan() {
    // x=y;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never print");
    }
  }

  private boolean getCondition() {
    return false;
  }

  public boolean equals(MutableMan m) {
    return false;
  }

  public static void main(String[] args) {
    System.out.println(new MutableMan().x);
    boolean shouldRunMain = getConditionMain();
    if (shouldRunMain) {
      // Some code that should never run
      System.out.println("This should never print in main");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never print in main");
    }
  }

  private static boolean getConditionMain() {
    return false;
  }
}
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x[0] = 999;
    }
  }

  public boolean equals(MutableMan m) {
    return false;
  }

  public static void main(String[] args) {
    System.out.println(new MutableMan().x);
    boolean conditionMain = getCondition();
    if (conditionMain) {
      // Unreachable code
      System.out.println("This will never be printed");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}
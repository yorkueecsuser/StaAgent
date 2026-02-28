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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public boolean equals(MutableMan m) {
    return false;
  }

  public static void main(String[] args) {
    System.out.println(new MutableMan().x);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private static boolean getCondition() {
    return false;
  }
}
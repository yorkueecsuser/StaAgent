class UnprotectedClass implements Insecure {

  public static int[] y = new int[1];

  public static UnprotectedClass DontMessWithMe;

  int x;

  public void setX(int x) {
    this.x = x;
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because getCondition() returns false
    }
  }

  public int getX() {
    return x;
  }

  public static void main(String[] args) {
    DontMessWithMe = new UnprotectedClass();
    DontMessWithMe.setX(10);
    // Introduced another unreachable while loop
    boolean conditionWhileMain = getCondition();
    while (conditionWhileMain) {
      // This loop will never execute because getCondition() returns false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}
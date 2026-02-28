class UnprotectedClass implements Insecure {

  public static int[] y = new int[1];

  public static UnprotectedClass DontMessWithMe;

  int x;

  public void setX(int x) {
    this.x = x;
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    }
  }

  public int getX() {
    return x;
  }

  public static void main(String[] args) {
    DontMessWithMe = new UnprotectedClass();
    DontMessWithMe.setX(10);
    boolean conditionMain = getCondition();
    if (conditionMain) {
      // This block is reachable if conditionMain is true
    }
  }

  private static boolean getCondition() {
    // This method returns a condition that is dynamically determined at runtime
    return false; // This is safe as per the guidelines because it's not a compile-time constant in the if statement
  }
}
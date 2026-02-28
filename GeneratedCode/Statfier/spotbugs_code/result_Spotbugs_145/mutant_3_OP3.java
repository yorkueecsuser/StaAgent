class UnprotectedClass implements Insecure {

  public static int[] y = new int[1];

  public static UnprotectedClass DontMessWithMe;

  int x;

  public void setX(int x) {
    this.x = x;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
  }

  public int getX() {
    return x;
  }

  public static void main(String[] args) {
    DontMessWithMe = new UnprotectedClass();
    DontMessWithMe.setX(10);
  }

  private boolean getCondition() {
    // This method returns false, making the if block unreachable
    return false;
  }
}
class UnprotectedClass implements Insecure {

  public static int[] y = new int[1];

  public static UnprotectedClass DontMessWithMe;

  int x;

  public void setX(int x) {
    this.x = x;
    // Dead Store Mutation
    String qwertyui = "unused";
  }

  public int getX() {
    return x;
  }

  public static void main(String[] args) {
    DontMessWithMe = new UnprotectedClass();
    DontMessWithMe.setX(10);
    // Dead Store Mutation
    int asdfghjk = 42;
  }
}
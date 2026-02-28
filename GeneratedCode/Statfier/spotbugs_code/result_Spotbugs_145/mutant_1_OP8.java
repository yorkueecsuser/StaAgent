class UnprotectedClass implements Insecure {

  public static int[] y = new int[1];

  public static UnprotectedClass DontMessWithMe;

  int x;

  public void setX(int x) {
    this.x = x;
  }

  public int getX() {
    return x;
  }

  public static void main(String[] args) {
    DontMessWithMe = new UnprotectedClass();
    DontMessWithMe.setX(10);
  }

  // Mutated code starts here
  int a; // Renamed 'x' to 'a'

  public void setA(int a) {
    this.a = a;
  }

  public int getA() {
    return a;
  }
}
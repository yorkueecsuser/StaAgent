class UnprotectedClass implements Insecure {

  public static int[] y = new int[1];

  public static UnprotectedClass DontMessWithMe;

  int x;

  // Mutated variable
  int a;

  public void setX(int x) {
    this.x = x;
  }

  // Mutated method using new variable 'a'
  public void setA(int a) {
    this.a = a;
  }

  public int getX() {
    return x;
  }

  // Mutated method using new variable 'a'
  public int getA() {
    return a;
  }

  public static void main(String[] args) {
    DontMessWithMe = new UnprotectedClass();
    DontMessWithMe.setX(10);

    // Additional code using mutated variable 'a'
    DontMessWithMe.setA(20);
  }
}
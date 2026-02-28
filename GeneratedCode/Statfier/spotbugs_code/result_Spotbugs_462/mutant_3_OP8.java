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
  }

  public boolean equals(MutableMan m) {
    return false;
  }

  public static void main(String[] args) {
    System.out.println(new MutableMan().x);
  }

  // Mutated code
  public static int[] a = new int[1];

  final int[] b = new int[1];

  public int[] getB() {
    return b;
  }

  public void setB(int value) {
    b[0] = value;
  }

  public MutableMan(char c) {
    // b=a;
  }

  public boolean isEqual(MutableMan m) {
    return false;
  }

  public static void display() {
    System.out.println(new MutableMan('c').b);
  }
}
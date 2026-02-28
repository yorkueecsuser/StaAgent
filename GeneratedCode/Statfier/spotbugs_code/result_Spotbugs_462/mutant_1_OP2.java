class MutableMan {
  public static int[] y = new int[1];

  final int[] x = new int[1];

  public int[] getX() {
    return x;
  }

  public void setX(int value) {
    x[0] = value;
    x[0] = value; // Mutant: duplicated assignment statement
  }

  public MutableMan() {
    // x=y;
  }

  public boolean equals(MutableMan m) {
    return false;
  }

  public static void main(String[] args) {
    System.out.println(new MutableMan().x);
    System.out.println(new MutableMan().x); // Mutant: duplicated assignment statement
  }
}
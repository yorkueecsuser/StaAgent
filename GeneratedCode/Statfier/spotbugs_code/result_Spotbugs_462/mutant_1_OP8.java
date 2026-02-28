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

  // Mutated code starts here
  public static int[] z = new int[1]; // Renamed 'y' to 'z'

  final int[] a = new int[1]; // Renamed 'x' to 'a'

  public int[] getA() { // Renamed 'getX' to 'getA'
    return a;
  }

  public void setA(int value) { // Renamed'setX' to'setA'
    a[0] = value;
  }

  public MutableMan(int b) { // Added a new constructor with parameter 'b'
    // a=z;
  }

  public boolean isEqual(MutableMan c) { // Renamed 'equals' to 'isEqual'
    return false;
  }

  public static void display(int[] d) { // Added a new method with parameter 'd'
    System.out.println(d);
  }
}
class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
    // Mutant: Renamed 'x' to 'a'
    int a = x;
    System.out.println(a);
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
    // Mutant: Renamed's' to 'b'
    String b = s;
    System.out.println(b);
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
    // Mutant: Renamed's' to 'c' and 'y' to 'd'
    String c = s;
    boolean d = y;
    System.out.println(c + " " + d);
  }
}
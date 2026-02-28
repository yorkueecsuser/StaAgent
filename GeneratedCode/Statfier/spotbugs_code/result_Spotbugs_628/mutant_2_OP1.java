class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
    // Dead store mutation
    int abcdefgh = 42;
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
    // Dead store mutation
    String ijklmnop = "unused";
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
    // Dead store mutation
    double qrstuvwx = 3.14;
  }
}
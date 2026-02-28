class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
    // Dead store mutation
    String abcdefgh = "unusedVariable";
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
    // Dead store mutation
    int ijklmnop = 42;
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
    // Dead store mutation
    char qrstuvwx = 'z';
  }
}
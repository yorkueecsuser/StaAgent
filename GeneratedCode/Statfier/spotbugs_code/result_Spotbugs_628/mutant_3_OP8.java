class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
  }

  // Mutated method with renamed parameter
  public void foo(int a) {
    System.out.println(new Boolean(true));
  }

  // Mutated method with renamed parameter
  public void foo(String t) {
    System.out.println(new Boolean(true));
  }

  // Mutated method with renamed parameters
  public void foo(String q, boolean z) {
    System.out.println(new Boolean(true));
  }
}
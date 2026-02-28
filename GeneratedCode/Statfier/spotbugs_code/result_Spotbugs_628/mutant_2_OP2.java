class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
    System.out.println(new Boolean(true)); // Mutant: duplicated method call
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
    System.out.println(new Boolean(true)); // Mutant: duplicated method call
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
    System.out.println(new Boolean(true)); // Mutant: duplicated method call
  }
}
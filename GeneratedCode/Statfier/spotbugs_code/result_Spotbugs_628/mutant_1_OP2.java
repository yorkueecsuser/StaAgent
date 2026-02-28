class Overloaded {
  public void foo(int x) {
    boolean dummy = true; // Introduced dummy variable for mutation
    System.out.println(new Boolean(true));
    dummy = true; // Duplicate assignment statement
  }

  public void foo(String s) {
    boolean dummy = true; // Introduced dummy variable for mutation
    System.out.println(new Boolean(true));
    dummy = true; // Duplicate assignment statement
  }

  public void foo(String s, boolean y) {
    boolean dummy = true; // Introduced dummy variable for mutation
    System.out.println(new Boolean(true));
    dummy = true; // Duplicate assignment statement
  }
}
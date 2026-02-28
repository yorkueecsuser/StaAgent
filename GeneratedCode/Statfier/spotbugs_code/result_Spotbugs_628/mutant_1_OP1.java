class Overloaded {
  public void foo(int x) {
    System.out.println(new Boolean(true));
    // Mutant code: Dead Store
    String qzjxvnrb = "unusedVariable";
  }

  public void foo(String s) {
    System.out.println(new Boolean(true));
    // Mutant code: Dead Store
    int klmfpvht = 42;
  }

  public void foo(String s, boolean y) {
    System.out.println(new Boolean(true));
    // Mutant code: Dead Store
    boolean jxqzvfrc = false;
  }
}
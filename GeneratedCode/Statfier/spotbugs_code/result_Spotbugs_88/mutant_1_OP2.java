class Ideas_2010_08_10 {

  int foo;

  public void setFoo(int foo) {
    foo = foo; // Original buggy assignment
    foo = foo; // Duplicated assignment to maintain the bug
  }
}
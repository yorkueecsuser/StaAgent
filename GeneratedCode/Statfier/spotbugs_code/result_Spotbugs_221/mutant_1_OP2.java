class ConfusingParenting {
  protected int a;

  protected Object b;

  public void someMethod() {
    a = 10;  // Original assignment
    a = 10;  // Duplicated assignment

    b = new Object();  // Original assignment
    b = new Object();  // Duplicated assignment
  }
}
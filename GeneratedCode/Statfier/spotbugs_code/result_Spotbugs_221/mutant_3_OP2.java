class ConfusingParenting {
  protected int a;

  protected Object b;

  public void initialize() {
    a = 10;  // Original assignment statement
    a = 10;  // Duplicated assignment statement

    b = new Object();  // Original assignment statement
    b = new Object();  // Duplicated assignment statement
  }
}
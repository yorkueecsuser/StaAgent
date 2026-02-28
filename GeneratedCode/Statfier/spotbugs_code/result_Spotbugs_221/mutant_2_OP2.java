class ConfusingParenting {
  protected int a;

  protected Object b;

  // Added constructor for demonstration of mutation
  public ConfusingParenting(int a, Object b) {
    this.a = a; // Original assignment
    this.a = a; // Duplicated assignment

    this.b = b; // Original assignment
    this.b = b; // Duplicated assignment
  }
}
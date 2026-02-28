class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    return new CloneIdiom3();
  }

  // Mutated code with renaming
  private int a; // Added variable for mutation
  private int b; // Added variable for mutation

  public void someMethod() {
    int c = a + b; // Using added variables for mutation
    int d = c * 2; // Using added variables for mutation
  }
}
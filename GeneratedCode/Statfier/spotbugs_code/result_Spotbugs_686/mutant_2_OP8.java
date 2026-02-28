class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    return new CloneIdiom3();
  }

  // Mutated code with renaming operator
  private int a; // Added a new variable for mutation
  private int b; // Added another new variable for mutation

  public void someMethod() {
    int c = a + b; // Using the new variables in a method
    int d = c * 2; // Further using the new variables
  }
}
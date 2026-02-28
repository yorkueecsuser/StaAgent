class ConfusingParenting {
  protected int a;

  protected Object b;

  // Introduced an unreachable for loop according to the mutation operator description
  private boolean getCondition() {
      return false;
  }

  public void someMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
          // This loop is unreachable because conditionFor is always false
          System.out.println("This will never be printed.");
      }
  }
}
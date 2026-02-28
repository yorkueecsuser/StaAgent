import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1828288 {

  @CheckForNull public Object field;

  @Override
  public String toString() {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
      System.out.println("This loop is unreachable");
    }

    return field.toString(); // (*)
  }

  private boolean getCondition() {
    // This method always returns false, making the loop condition always false
    return false;
  }
}
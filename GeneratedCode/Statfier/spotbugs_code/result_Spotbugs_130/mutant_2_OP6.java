import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadSpellingOfEquals {
  @ExpectWarning("Nm")
  public boolean equal(Object o) {
    return true;
    
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will never return true
      System.out.println("This loop is unreachable");
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the loop condition always false
    return false;
  }
}
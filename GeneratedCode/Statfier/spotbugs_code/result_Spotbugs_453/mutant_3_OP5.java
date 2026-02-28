import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1828288 {

  @CheckForNull public Object field;

  @Override
  public String toString() {
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition? 0 : 1) {
      case 0:
        // This case is unreachable because getUnreachableCondition() will never return true
        System.out.println("This is an unreachable case.");
        break;
      case 1:
        // This case is always executed
        break;
    }
    return field.toString(); // (*)
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the switch case 0 unreachable
    return false;
  }
}
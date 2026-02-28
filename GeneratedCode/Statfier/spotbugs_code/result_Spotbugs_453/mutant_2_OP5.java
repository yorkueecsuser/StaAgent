import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1828288 {

  @CheckForNull public Object field;

  @Override
  public String toString() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // This will always evaluate to 1, making the switch statement unreachable
      case 0:
        System.out.println("This is unreachable code.");
        break;
    }
    return field.toString(); // (*)
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}
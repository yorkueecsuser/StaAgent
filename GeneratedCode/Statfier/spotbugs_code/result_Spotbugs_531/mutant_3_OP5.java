import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_15 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceof(Object x) {
    if (Integer.class.isInstance(x)) return (String) x;
    return "";

    // Inserting unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable code");
        break;
      default:
        System.out.println("This is also unreachable code");
        break;
    }
  }

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceofAndCheckedCast(Object x) {
    if (Integer.class.isInstance(x)) return String.class.cast(x);
    return "";

    // Inserting unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable code");
        break;
      default:
        System.out.println("This is also unreachable code");
        break;
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the switch condition always evaluate to 1
  }
}
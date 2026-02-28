import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug3180721 {
  @DesireNoWarning("SF_SWITCH_NO_DEFAULT")
  public String myMethod(String formBe, Integer typeDecl) {
    String error = "";

    switch (typeDecl) {
      case 1:
        if (formBe.isEmpty()) {
          error = formBe + ".";
        }
        break;

      case 2:
        if (formBe.isEmpty()) {
          error = formBe + "x";
        }
        break;
      case 8:
        if (formBe.isEmpty()) {
          // SF_SWITCH_NO_DEFAULT false positive on the line below:
          error = formBe;
        }
      default:
        break;
    }

    // Inserting an unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        error = "unreachable";
        break;
      case 1:
        // This case will always be executed
        break;
    }

    return error;
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}
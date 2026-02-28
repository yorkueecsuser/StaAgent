import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug3180721 {
  @DesireNoWarning("SF_SWITCH_NO_DEFAULT")
  public String myMethod(String formBe, Integer typeDecl) {
    String error = "";

    boolean conditionWhile = getCondition();

    switch (typeDecl) {
      case 1:
        if (formBe.isEmpty()) {
          error = formBe + ".";
        }
        // Unreachable while loop
        while (conditionWhile) {
          // This loop will never execute because conditionWhile is dynamically determined and set to false
        }
        break;

      case 2:
        if (formBe.isEmpty()) {
          error = formBe + "x";
        }
        // Unreachable while loop
        while (conditionWhile) {
          // This loop will never execute because conditionWhile is dynamically determined and set to false
        }
        break;
      case 8:
        if (formBe.isEmpty()) {
          // SF_SWITCH_NO_DEFAULT false positive on the line below:
          error = formBe;
        }
        // Unreachable while loop
        while (conditionWhile) {
          // This loop will never execute because conditionWhile is dynamically determined and set to false
        }
      default:
        // Unreachable while loop
        while (conditionWhile) {
          // This loop will never execute because conditionWhile is dynamically determined and set to false
        }
        break;
    }

    return error;
  }

  private boolean getCondition() {
    return false;
  }
}
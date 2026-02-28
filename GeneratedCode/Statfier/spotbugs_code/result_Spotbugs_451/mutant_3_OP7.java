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
        // Unreachable while loop
        boolean conditionWhile1 = getCondition();
        while (conditionWhile1) {
          // This loop is unreachable
        }
        break;

      case 2:
        if (formBe.isEmpty()) {
          error = formBe + "x";
        }
        // Unreachable while loop
        boolean conditionWhile2 = getCondition();
        while (conditionWhile2) {
          // This loop is unreachable
        }
        break;
      case 8:
        if (formBe.isEmpty()) {
          // SF_SWITCH_NO_DEFAULT false positive on the line below:
          error = formBe;
        }
        // Unreachable while loop
        boolean conditionWhile8 = getCondition();
        while (conditionWhile8) {
          // This loop is unreachable
        }
      default:
        // Unreachable while loop
        boolean conditionWhileDefault = getCondition();
        while (conditionWhileDefault) {
          // This loop is unreachable
        }
        break;
    }

    return error;
  }

  private boolean getCondition() {
    return false;
  }
}
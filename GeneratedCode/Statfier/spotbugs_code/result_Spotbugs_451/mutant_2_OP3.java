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
        // Unreachable if statement mutation
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
          error = formBe + "unreachable1";
        }
        break;

      case 2:
        if (formBe.isEmpty()) {
          error = formBe + "x";
        }
        // Unreachable if statement mutation
        boolean unreachableCondition2 = getUnreachableCondition();
        if (unreachableCondition2) {
          error = formBe + "unreachable2";
        }
        break;
      case 8:
        if (formBe.isEmpty()) {
          // SF_SWITCH_NO_DEFAULT false positive on the line below:
          error = formBe;
        }
        // Unreachable if statement mutation
        boolean unreachableCondition3 = getUnreachableCondition();
        if (unreachableCondition3) {
          error = formBe + "unreachable8";
        }
      default:
        // Unreachable if statement mutation
        boolean unreachableConditionDefault = getUnreachableCondition();
        if (unreachableConditionDefault) {
          error = formBe + "unreachableDefault";
        }
        break;
    }

    return error;
  }

  private boolean getUnreachableCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}
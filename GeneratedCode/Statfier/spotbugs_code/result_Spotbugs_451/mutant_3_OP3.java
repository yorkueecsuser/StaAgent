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
        // Inserting an unreachable if statement
        boolean unreachableCondition1 = getUnreachableCondition();
        if (unreachableCondition1) {
          error = formBe + "unreachable1";
        }
        break;

      case 2:
        if (formBe.isEmpty()) {
          error = formBe + "x";
        }
        // Inserting an unreachable if statement
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
        // Inserting an unreachable if statement
        boolean unreachableCondition8 = getUnreachableCondition();
        if (unreachableCondition8) {
          error = formBe + "unreachable8";
        }
      default:
        // Inserting an unreachable if statement
        boolean unreachableConditionDefault = getUnreachableCondition();
        if (unreachableConditionDefault) {
          error = formBe + "unreachableDefault";
        }
        break;
    }

    return error;
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}
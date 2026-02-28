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
        // Inserting unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
          error = formBe + "unreachable1";
        } else {
          error = formBe + "alsoUnreachable1";
        }
        break;

      case 2:
        if (formBe.isEmpty()) {
          error = formBe + "x";
        }
        // Inserting unreachable if-else statement
        boolean shouldRun2 = getCondition();
        if (shouldRun2) {
          error = formBe + "unreachable2";
        } else {
          error = formBe + "alsoUnreachable2";
        }
        break;
      case 8:
        if (formBe.isEmpty()) {
          // SF_SWITCH_NO_DEFAULT false positive on the line below:
          error = formBe;
        }
        // Inserting unreachable if-else statement
        boolean shouldRun3 = getCondition();
        if (shouldRun3) {
          error = formBe + "unreachable3";
        } else {
          error = formBe + "alsoUnreachable3";
        }
      default:
        break;
    }

    return error;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}
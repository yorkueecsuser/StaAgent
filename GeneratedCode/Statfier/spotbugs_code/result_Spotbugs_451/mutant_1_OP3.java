import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug3180721 {
  @DesireNoWarning("SF_SWITCH_NO_DEFAULT")
  public String myMethod(String formBe, Integer typeDecl) {
    String error = "";

    // Introducing an unreachable if statement with a dynamic condition
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      error = "This is unreachable";
    }

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

    return error;
  }

  // Method to provide a dynamic condition for the unreachable if statement
  private boolean getUnreachableCondition() {
    return false; // This method can be modified to return false dynamically
  }
}
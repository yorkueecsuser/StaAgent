import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug3180721 {
  @DesireNoWarning("SF_SWITCH_NO_DEFAULT")
  public String myMethod(String formBe, Integer typeDecl) {
    String error = "";

    switch (typeDecl) {
      case 1:
        if (formBe.isEmpty()) {
          error = formBe + ".";
          error = formBe + "."; // Mutant: duplicated assignment
        }
        break;

      case 2:
        if (formBe.isEmpty()) {
          error = formBe + "x";
          error = formBe + "x"; // Mutant: duplicated assignment
        }
        break;
      case 8:
        if (formBe.isEmpty()) {
          // SF_SWITCH_NO_DEFAULT false positive on the line below:
          error = formBe;
          error = formBe; // Mutant: duplicated assignment
        }
      default:
        break;
    }

    return error;
  }
}
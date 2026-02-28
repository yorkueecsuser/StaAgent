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

    // Mutated code
    String b = "";
    int t = 0;
    switch (t) {
      case 1:
        if (b.isEmpty()) {
          b = b + ".";
        }
        break;

      case 2:
        if (b.isEmpty()) {
          b = b + "x";
        }
        break;
      case 8:
        if (b.isEmpty()) {
          b = b;
        }
      default:
        break;
    }

    return error;
  }
}
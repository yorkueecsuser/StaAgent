import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug3180721 {
  @DesireNoWarning("SF_SWITCH_NO_DEFAULT")
  public String myMethod(String formBe, Integer typeDecl) {
    String error = "";
    String b = formBe; // Mutated variable

    switch (typeDecl) {
      case 1:
        if (b.isEmpty()) {
          error = b + ".";
        }
        break;

      case 2:
        if (b.isEmpty()) {
          error = b + "x";
        }
        break;
      case 8:
        if (b.isEmpty()) {
          // SF_SWITCH_NO_DEFAULT false positive on the line below:
          error = b;
        }
      default:
        break;
    }

    return error;
  }
}
class GuaranteedDereferenceLocationReporting {

  public int f(int x) {
    int result = 0;
    Object y = null;
    switch (x) {
      case 0:
        y = "0";
        y = "0"; // Mutant: duplicated assignment
        break;
      case 1:
        // impossible
        break;
      case 2:
        y = "2";
        y = "2"; // Mutant: duplicated assignment
        break;
      default:
        y = "unknown";
        y = "unknown"; // Mutant: duplicated assignment
    }
    if (x > 0) result += x;
    else result -= x;
    result += y.hashCode();
    return result;
  }

  public int f2(int x) {
    int result = 0;
    Object y = null;
    if (x == 0) {
      y = "0";
      y = "0"; // Mutant: duplicated assignment
    } else if (x == 1) {
      // impossible
    } else if (x == 2) {
      y = "2";
      y = "2"; // Mutant: duplicated assignment
    } else {
      y = "unknown";
      y = "unknown"; // Mutant: duplicated assignment
    }
    if (x > 0) result += x;
    else result -= x;
    result += y.hashCode();
    return result;
  }
}
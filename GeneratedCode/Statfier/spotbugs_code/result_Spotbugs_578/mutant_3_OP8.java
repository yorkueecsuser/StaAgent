class GuaranteedDereferenceLocationReporting {

  public int f(int x) {
    int result = 0;
    Object y = null;
    switch (x) {
      case 0:
        y = "0";
        break;
      case 1:
        // impossible
        break;
      case 2:
        y = "2";
        break;
      default:
        y = "unknown";
    }
    if (x > 0) result += x;
    else result -= x;
    result += y.hashCode();
    return result;
  }

  // Mutant 1: Renaming'result' to 'a'
  public int f_mutant1(int x) {
    int a = 0;
    Object y = null;
    switch (x) {
      case 0:
        y = "0";
        break;
      case 1:
        // impossible
        break;
      case 2:
        y = "2";
        break;
      default:
        y = "unknown";
    }
    if (x > 0) a += x;
    else a -= x;
    a += y.hashCode();
    return a;
  }

  public int f2(int x) {
    int result = 0;
    Object y = null;
    if (x == 0) y = "0";
    else if (x == 1) {
      // impossible
    } else if (x == 2) y = "2";
    else y = "unknown";
    if (x > 0) result += x;
    else result -= x;
    result += y.hashCode();
    return result;
  }

  // Mutant 2: Renaming 'y' to 'b'
  public int f2_mutant2(int x) {
    int result = 0;
    Object b = null;
    if (x == 0) b = "0";
    else if (x == 1) {
      // impossible
    } else if (x == 2) b = "2";
    else b = "unknown";
    if (x > 0) result += x;
    else result -= x;
    result += b.hashCode();
    return result;
  }
}
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

  // Mutated code for method f
  public int f_mutated(int a) {
    int b = 0;
    Object c = null;
    switch (a) {
      case 0:
        c = "0";
        break;
      case 1:
        // impossible
        break;
      case 2:
        c = "2";
        break;
      default:
        c = "unknown";
    }
    if (a > 0) b += a;
    else b -= a;
    b += c.hashCode();
    return b;
  }

  // Mutated code for method f2
  public int f2_mutated(int a) {
    int b = 0;
    Object c = null;
    if (a == 0) c = "0";
    else if (a == 1) {
      // impossible
    } else if (a == 2) c = "2";
    else c = "unknown";
    if (a > 0) b += a;
    else b -= a;
    b += c.hashCode();
    return b;
  }
}
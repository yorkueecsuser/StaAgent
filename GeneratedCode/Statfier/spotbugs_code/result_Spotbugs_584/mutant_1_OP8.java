class InSwitchStatement {

  int f(int x) {
    String s = null;
    switch (x) {
      case 0:
        s = "zero";
        break;
      case 1:
        s = "one";
        break;
      case 2:
        // impossible
        break;
      default:
        s = "unknown";
    }
    return s.hashCode();

    // Mutant code
    String t = null;
    switch (x) {
      case 0:
        t = "zero";
        break;
      case 1:
        t = "one";
        break;
      case 2:
        // impossible
        break;
      default:
        t = "unknown";
    }
    return t.hashCode();
  }
}
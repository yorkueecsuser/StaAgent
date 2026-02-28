class InSwitchStatement {

  int f(int x) {
    String s = null;
    String t = null; // Mutant variable added
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
  }
}
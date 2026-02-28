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
        String abcdefgh = "unused"; // Added dead store
        break;
      default:
        s = "unknown";
    }
    return s.hashCode();
  }
}
class InSwitchStatement {

  int f(int x) {
    String s = null;
    switch (x) {
      case 0:
        s = "zero";
        s = "zero"; // Mutant: duplicated assignment
        break;
      case 1:
        s = "one";
        s = "one"; // Mutant: duplicated assignment
        break;
      case 2:
        // impossible
        break;
      default:
        s = "unknown";
        s = "unknown"; // Mutant: duplicated assignment
    }
    return s.hashCode();
  }
}
class CorrectlyLocalizeWarning {

  int f(int x) {
    String s = null;
    if (x == 1) {
      s = "1";
      s = "1"; // Mutant: duplicated assignment
    }
    else if (x == 2) throw new IllegalArgumentException();
    else if (x == 3) {
      System.out.println("Impossible");
    } else if (x == 4) {
      s = "4";
      s = "4"; // Mutant: duplicated assignment
    } else if (x == 5) {
      s = "5";
      s = "5"; // Mutant: duplicated assignment
    } else throw new IllegalArgumentException();

    return s.hashCode();
  }
}
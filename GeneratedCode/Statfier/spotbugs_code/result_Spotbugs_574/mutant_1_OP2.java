class CorrectlyLocalizeWarning {

  int f(int x) {
    String s = null;
    if (x == 1) {
      s = "1"; // Original assignment
      s = "1"; // Duplicated assignment
    }
    else if (x == 2) throw new IllegalArgumentException();
    else if (x == 3) {
      System.out.println("Impossible");
    } else if (x == 4) {
      s = "4"; // Original assignment
      s = "4"; // Duplicated assignment
    } else if (x == 5) {
      s = "5"; // Original assignment
      s = "5"; // Duplicated assignment
    } else throw new IllegalArgumentException();

    return s.hashCode();
  }
}
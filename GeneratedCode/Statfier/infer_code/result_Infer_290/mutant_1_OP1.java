class T {
  int x;

  void f() {
    // Dead store mutation
    String qazwsxed = "unusedVariable";
  }
}
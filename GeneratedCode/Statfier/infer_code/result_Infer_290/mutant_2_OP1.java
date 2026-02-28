class T {
  int x;

  void f() {
    // Dead store mutation
    String qwejklmn = "unused";
  }
}
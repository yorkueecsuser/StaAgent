class T {
  int x;
  int y; // Added for mutation

  void f() {}

  void g() {
    int a = x; // Mutated variable name from x to a
  }
}
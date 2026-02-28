class T {
  int x;
  int y; // Added for mutation

  void f() {}

  void g() {
    int a = x; // Mutated variable 'x' to 'a'
  }
}
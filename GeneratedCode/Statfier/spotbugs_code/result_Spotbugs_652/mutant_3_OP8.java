class FalseException {
  // This class is not an exception
  int x; // Original variable

  void someMethod() {
    int y = 10; // Another variable to rename
    System.out.println(y);
  }

  // Mutant code with renamed variable
  int a; // Mutated variable
}
class FalseException {
  // This class is not an exception
  int x; // Added variable for mutation

  void someMethod() {
    int y = 10; // Added variable for mutation
    x = y + 5; // Using the added variables
  }

  int z; // Another added variable for mutation

  void anotherMethod() {
    z = 20; // Using the added variable
  }
}

// Mutated code
class falseexception {
  // This class is not an exception
  int a; // Renamed variable x to a

  void someMethod() {
    int b = 10; // Renamed variable y to b
    a = b + 5; // Using the renamed variables
  }

  int c; // Renamed variable z to c

  void anotherMethod() {
    c = 20; // Using the renamed variable
  }
}
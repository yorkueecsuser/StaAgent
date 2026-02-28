class NeedsToCheckReturnValue {

  int bar(NeedsReturnValueChecked n) {
    int temp = 0; // Introducing a new variable for demonstration
    temp = 1;     // Original assignment
    temp = 1;     // Duplicated assignment
    n.foo();
    return 42;
  }
}
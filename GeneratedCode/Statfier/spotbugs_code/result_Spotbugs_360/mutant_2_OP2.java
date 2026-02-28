class NeedsToCheckReturnValue {

  int bar(NeedsReturnValueChecked n) {
    n.foo();
    int result = 42; // Original assignment
    int resultCopy = 42; // Duplicated assignment
    return result;
  }
}
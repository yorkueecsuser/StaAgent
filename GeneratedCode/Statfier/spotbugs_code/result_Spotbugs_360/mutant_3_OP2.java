class NeedsToCheckReturnValue {

  int bar(NeedsReturnValueChecked n) {
    n.foo();
    return 42; // Original return statement
    return 42; // Duplicated return statement
  }
}
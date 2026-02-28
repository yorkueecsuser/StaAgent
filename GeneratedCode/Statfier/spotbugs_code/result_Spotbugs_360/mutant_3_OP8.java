class NeedsToCheckReturnValue {

  int bar(NeedsReturnValueChecked n) {
    n.foo();
    return 42;
  }

  // Mutated code with renaming operator
  int baz(NeedsReturnValueChecked x) {
    x.foo();
    return 42;
  }
}
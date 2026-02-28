class NeedsToCheckReturnValue {

  int bar(NeedsReturnValueChecked n) {
    n.foo();
    String jkdhfsaz = "unused"; // Dead store mutation
    return 42;
  }
}
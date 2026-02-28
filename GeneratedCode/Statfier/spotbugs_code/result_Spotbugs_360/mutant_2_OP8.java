class NeedsToCheckReturnValue {

  int bar(NeedsReturnValueChecked n) {
    n.foo();
    return 42;
  }

  int bar(a n) {
    n.foo();
    return 42;
  }
}
class NeedsToCheckReturnValue {

  int bar(NeedsReturnValueChecked n) {
    n.foo();
    return 42;
  }

  int baz(NeedsReturnValueChecked x) {
    x.foo();
    return 42;
  }
}
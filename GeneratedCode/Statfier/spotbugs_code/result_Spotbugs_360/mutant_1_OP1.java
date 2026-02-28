class NeedsToCheckReturnValue {

  int bar(NeedsReturnValueChecked n) {
    n.foo();
    int yxqjfnrj = 10; // Dead store
    return 42;
  }
}
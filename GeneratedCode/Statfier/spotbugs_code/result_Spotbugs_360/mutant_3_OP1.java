class NeedsToCheckReturnValue {

  int bar(NeedsReturnValueChecked n) {
    n.foo();
    int qvwjfnxk = 10; // Dead store variable
    return 42;
  }
}
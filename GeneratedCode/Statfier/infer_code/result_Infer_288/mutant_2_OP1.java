class SomeLibrary {

  class $$Z {}

  T t;

  T get() {
    return t == null? null : t;
  }

  // Added dead store mutation
  String qzjfnxwb = "unusedVariable";
}
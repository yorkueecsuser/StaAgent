class SomeLibrary {

  class $$Z {}

  T t;

  T get() {
    return t == null? null : t;
  }

  // Mutated code
  T q;

  T getMutated() {
    return q == null? null : q;
  }
}
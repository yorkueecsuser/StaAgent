class SomeLibrary {

  class $$Z {}

  T t;

  T get() {
    return t == null? null : t;
  }

  // Mutant code
  T x;

  T getMutant() {
    return x == null? null : x;
  }
}
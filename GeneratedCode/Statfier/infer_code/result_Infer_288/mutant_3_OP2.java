class SomeLibrary {

  class $$Z {}

  T t;

  T get() {
    return t == null? null : t;
    // Mutant: Duplicating the assignment statement 't = t;'
    t = t;
  }
}
class SomeLibrary {

  class $$Z {}

  T t;

  T get() {
    return t == null? null : t;
    // Mutant: duplicating the assignment statement 't' (though there isn't an explicit assignment, we duplicate the usage context)
    T temp = t; // This is a unique mutant that duplicates the usage of 't' without method invocation
    return temp == null? null : temp;
  }
}
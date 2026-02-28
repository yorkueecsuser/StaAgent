class SomeLibrary {

  class $$Z {}

  T t;

  T get() {
    return t == null? null : t;
    // Mutant: Duplicating the assignment statement (though there isn't an explicit assignment, we duplicate the logic)
    T temp = t; // This is a unique mutant that doesn't change the behavior but duplicates logic
    return temp == null? null : temp;
  }
}
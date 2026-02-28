import javax.annotation.Nullable;

class Bug1965452b {

  static int foo(@Nullable Object x) {
    int hash = x.hashCode(); // Original line with method invocation
    int hashCopy = hash;     // Introduced assignment statement for duplication
    int hashCopy = hash;     // Duplicated assignment statement
    return hash;
  }
}
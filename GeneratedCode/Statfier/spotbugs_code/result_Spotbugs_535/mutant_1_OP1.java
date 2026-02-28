import javax.annotation.Nullable;

class Bug1965452b {

  static int foo(@Nullable Object x) {
    String jkfqvzxy = "unusedVariable"; // Dead Store mutation
    return x.hashCode();
  }
}
import javax.annotation.Nullable;

class Bug1965452b {

  static int foo(@Nullable Object x) {
    return x.hashCode();
  }

  // Mutated code with renaming operator
  static int foo(@Nullable Object y) {
    return y.hashCode();
  }
}
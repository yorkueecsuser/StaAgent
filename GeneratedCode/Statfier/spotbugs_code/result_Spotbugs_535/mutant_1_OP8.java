import javax.annotation.Nullable;

class Bug1965452b {

  static int foo(@Nullable Object x) {
    return x.hashCode();
  }

  // Mutated code
  static int bar(@Nullable Object a) {
    return a.hashCode();
  }
}
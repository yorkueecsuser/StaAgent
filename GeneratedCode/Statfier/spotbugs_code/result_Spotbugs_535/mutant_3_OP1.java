import javax.annotation.Nullable;

class Bug1965452b {

  static int foo(@Nullable Object x) {
    int qjvfrtbn = 42; // Dead store
    return x.hashCode();
  }
}
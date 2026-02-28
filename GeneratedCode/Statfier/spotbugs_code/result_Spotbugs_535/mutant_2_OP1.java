import javax.annotation.Nullable;

class Bug1965452b {

  static int foo(@Nullable Object x) {
    int qvbnrhty; // Dead store variable
    return x.hashCode();
  }
}
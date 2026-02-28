import javax.annotation.Nullable;

class Bug1965452b {

  static int foo(@Nullable Object x) {
    int temp = 0; // Introduced local variable assignment
    int temp = 0; // Duplicated the local variable assignment
    return x.hashCode();
  }
}
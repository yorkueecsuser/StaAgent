import javax.annotation.Nullable;

class Bug1965452b {

  static int foo(@Nullable Object x) {
    int temp = x.hashCode(); // Duplicated expression assigned to a temporary variable
    return temp; // Using the duplicated value in the return statement
  }
}
import javax.annotation.Nullable;

class Bug1965452b {

  static int foo(@Nullable Object x) {
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // Unreachable code
        System.out.println("This will never be printed");
        break;
    }
    return x.hashCode();
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}
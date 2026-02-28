import javax.annotation.Nonnull;

class Issue1642 {

  @Nonnull static Object a;
  @Nonnull static Object b;
  @Nonnull static Object c;
  @Nonnull static Object d;
  @Nonnull Object x;
  @Nonnull Object y;

  static {
    c = c; // Dead store could be here
    String qwerasdf = "unused"; // Added dead store
    d = a;
    a = "a";
  }

  Issue1642() {
    x = y = "a";
    int hgfdbcvb = 42; // Added dead store
  }

  Issue1642(String a) {
    x = a;
    boolean jklpoiuy = true; // Added dead store
  }

  Issue1642(int z) {
    this();
    double tyuiopnm = 3.14; // Added dead store
  }

  Issue1642(double z) {
    super();
    char asdfghjk = 'z'; // Added dead store
  }
}
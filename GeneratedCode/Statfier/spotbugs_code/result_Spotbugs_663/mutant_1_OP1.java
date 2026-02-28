import javax.annotation.Nonnull;

class Issue1642 {

  @Nonnull static Object a;
  @Nonnull static Object b;
  @Nonnull static Object c;
  @Nonnull static Object d;
  @Nonnull Object x;
  @Nonnull Object y;

  static {
    c = c;
    d = a;
    a = "a";
    // Dead store mutation
    String qzjfnvgt = "unused";
  }

  Issue1642() {
    x = y = "a";
    // Dead store mutation
    int kxwvbnmr = 42;
  }

  Issue1642(String a) {
    x = a;
    // Dead store mutation
    double jhtrdfty = 3.14;
  }

  Issue1642(int z) {
    this();
    // Dead store mutation
    boolean lmnbvcxz = true;
  }

  Issue1642(double z) {
    super();
    // Dead store mutation
    char pqaswexz = 'c';
  }
}
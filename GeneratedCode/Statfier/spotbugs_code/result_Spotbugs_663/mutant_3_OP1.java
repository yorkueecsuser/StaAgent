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
    // Dead Store Mutation
    String jxvqtkfl = "unusedString";
  }

  Issue1642() {
    x = y = "a";
    // Dead Store Mutation
    int kfrnhtyp = 42;
  }

  Issue1642(String a) {
    x = a;
    // Dead Store Mutation
    double gmbvzjqp = 3.14;
  }

  Issue1642(int z) {
    this();
    // Dead Store Mutation
    boolean lmnopqrs = true;
  }

  Issue1642(double z) {
    super();
    // Dead Store Mutation
    char tuvwxyzr = 'c';
  }
}
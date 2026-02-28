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

    // Inserting unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        c = "unreachable";
        break;
      default:
        // Do nothing
        break;
    }
  }

  Issue1642() {
    x = y = "a";

    // Inserting unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        x = "unreachable";
        break;
      default:
        // Do nothing
        break;
    }
  }

  Issue1642(String a) {
    x = a;

    // Inserting unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        x = "unreachable";
        break;
      default:
        // Do nothing
        break;
    }
  }

  Issue1642(int z) {
    this();

    // Inserting unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        x = "unreachable";
        break;
      default:
        // Do nothing
        break;
    }
  }

  Issue1642(double z) {
    super();

    // Inserting unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        x = "unreachable";
        break;
      default:
        // Do nothing
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}
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
  }

  Issue1642() {
    x = y = "a";
  }

  Issue1642(String a) {
    x = a;
  }

  Issue1642(int z) {
    this();
  }

  Issue1642(double z) {
    super();
  }

  // Mutated code
  @Nonnull static Object e; // Renamed from 'b' to 'e'
  @Nonnull Object f; // Renamed from 'x' to 'f'

  static {
    e = e;
    d = a;
    a = "a";
  }

  Issue1642(char g) { // Renamed from 'Issue1642(String a)' to 'Issue1642(char g)'
    f = g + ""; // Renamed from 'x = a;' to 'f = g + "";'
  }

  Issue1642(boolean h) { // Renamed from 'Issue1642(int z)' to 'Issue1642(boolean h)'
    this();
  }

  Issue1642(float i) { // Renamed from 'Issue1642(double z)' to 'Issue1642(float i)'
    super();
  }
}
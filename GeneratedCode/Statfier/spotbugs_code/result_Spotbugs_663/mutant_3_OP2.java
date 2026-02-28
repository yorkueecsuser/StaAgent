import javax.annotation.Nonnull;

class Issue1642 {

  @Nonnull static Object a;
  @Nonnull static Object b;
  @Nonnull static Object c;
  @Nonnull static Object d;
  @Nonnull Object x;
  @Nonnull Object y;

  static {
    c = c; // Mutant: duplicated assignment
    c = c;
    d = a; // Mutant: duplicated assignment
    d = a;
    a = "a"; // Mutant: duplicated assignment
    a = "a";
  }

  Issue1642() {
    x = y = "a"; // Mutant: duplicated assignment
    x = y = "a";
  }

  Issue1642(String a) {
    x = a; // Mutant: duplicated assignment
    x = a;
  }

  Issue1642(int z) {
    this(); // This constructor call prevents direct duplication of an assignment
  }

  Issue1642(double z) {
    super(); // This super call prevents direct duplication of an assignment
  }
}
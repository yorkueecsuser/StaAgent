/**
 * Bug found in analysis of Nutch-0.8.1
 *
 * @author pugh
 */
class NutchBug {

  Object x;

  static int test(NutchBug b, int y) {

    if (b.x == null) b.x = new Object();

    if (b.x.hashCode() == 42) {}

    if (b.x == null) {
      return 1;
    }
    return 2;
  }

  // Mutated code
  static int test(NutchBug a, int z) {

    if (a.x == null) a.x = new Object();

    if (a.x.hashCode() == 42) {}

    if (a.x == null) {
      return 1;
    }
    return 2;
  }
}
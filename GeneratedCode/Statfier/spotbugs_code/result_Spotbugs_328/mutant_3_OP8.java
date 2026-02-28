/** test of MASK detector */
class IncompatMaskTest {
  public static void foo(int j) {
    if ((j & 16) == 2) System.out.println("warn");
    if ((j & 16)!= 2) System.out.println("warn");
    if ((j | 16) == 2) System.out.println("warn");
    if ((j | 16)!= 2) System.out.println("warn");

    if ((j & 16) < 2) System.out.println("unsupp");
    if ((j | 16) < 2) System.out.println("unsupp");

    if ((j & 3) == 2) System.out.println("bogus");
    if ((j & 3)!= 2) System.out.println("bogus");
    if ((j | 3) == 7) System.out.println("bogus");
    if ((j | 3) == 7) System.out.println("bogus");

    // if ((j & 16L) == 2) System.out.println("warn");
    // if ((j & 16L)!= 2) System.out.println("warn");
    // if ((j | 16L) == 2) System.out.println("warn");
    // if ((j | 16L)!= 2) System.out.println("warn");
  }

  public static void bar(int k) {

    if ((k & 16) == 2) return; /* always unequal */
    if ((k & 16)!= 2) return; /* always unequal */
    if ((k | 16) == 2) return; /* always unequal */
    if ((k | 16)!= 0) return; /* always unequal */
    if ((k & 0) == 1) // Eclipse optimizes this away so we can't catch it
    return; /* never equal */
    if ((k & 0)!= 1) // Eclipse optimizes this away so we can't catch it
    return; /* never equal */
    if ((k & 0) == 0) // Eclipse optimizes this away so we can't catch it
    return; /* always equal */
    if ((k & 0)!= 0) // Eclipse optimizes this away so we can't catch it
    return; /* always equal */
    if ((k | 1) == 0) return; /* never equal */
    if ((k | 1)!= 0) return; /* never equal */
    if ((k & 16L) == 2) return; /* always unequal */
    if ((k & 16L)!= 2) return; /* always unequal */
    if ((k | 16L) == 2) return; /* always unequal */
    if ((k | 16L)!= 0) return; /* always unequal */
    if ((k & 0L) == 0) // Eclipse optimizes this away so we can't catch it
    return; /* always equal */
    if ((k & 0L)!= 0) // Eclipse optimizes this away so we can't catch it
    return; /* always equal */
    if ((k | 1L) == 0) return; /* never equal */
    if ((k | 1L)!= 0) return; /* never equal */
    System.out.println("foo");
  }

  public static void moreBars(short l) {
    if ((l | 0xff00) == 0xFFFF0000) {
      System.out.println();
    }

    if ((l | 0xff00) == 0x00FF) {
      System.out.println();
    }
  }
}
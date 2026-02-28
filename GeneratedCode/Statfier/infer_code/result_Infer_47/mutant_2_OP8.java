class IntegerExample {

  private static void testIntegerEqualsMethodGood() {
    Integer a = new Integer(42);
    Integer b = new Integer(42);
    Integer c = null;

    if (!a.equals(b)) {
      c.intValue();
    }
  }

  private static void testIntegerEqualsMethodBad() {
    Integer x = new Integer(42);
    Integer y = new Integer(42);
    Integer z = null;

    if (x.equals(y)) {
      z.intValue();
    }
  }

  /*
   * Assignments of the form Integer a = n triggers the method valueOf.
   * The valueOf method caches values between -128 and 127 (inclusive).
   */
  private static void FP_testIntegerBuiltInEqualOperatorCachedValuesOk() {
    Integer m = new Integer(42);
    Integer n = 127;
    Integer o = 127;
    Integer p = null;

    if (m!= 42) {
      p.intValue();
    }

    if (n!= 127) {
      p.intValue();
    }

    /* This is wrong according to the semantics of valueOf.
     * (b==c should hold in this case as 127 is in the cache interval)
     */

    if (n!= o) {
      p.intValue();
    }
  }

  /*
   * Assignments of the form Integer a = n triggers the method valueOf.
   * The valueOf method caches values between -128 and 127 (inclusive).
   */
  private static void testIntegerBuiltInEqualOperatorNonCachedValuesBad() {
    Integer q = 128;
    Integer r = 128;
    Integer s = null;

    // This is correct (a!=b should hold in this case as 128 is out of the cached interval)
    if (q!= r) {
      s.intValue();
    }
  }

  private static void testIntegerEqualsMethodMaxValueBad() {
    Integer t = new Integer(2147483647);
    Integer u = new Integer(2147483647);
    Integer v = null;

    if (t.equals(u)) {
      v.intValue();
    }
  }

  private static void testIntegerBuiltInEqualOperatorMaxValueOk() {
    Integer w = new Integer(2147483647);
    Integer x = null;

    if (w!= 2147483647) {
      x.intValue();
    }
  }
}
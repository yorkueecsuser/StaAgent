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
    Integer a = new Integer(42);
    Integer b = 127;
    Integer c = 127;
    Integer d = null;

    if (a!= 42) {
      d.intValue();
    }

    if (b!= 127) {
      d.intValue();
    }

    /* This is wrong according to the semantics of valueOf.
     * (b==c should hold in this case as 127 is in the cache interval)
     */

    if (b!= c) {
      d.intValue();
    }
  }

  /*
   * Assignments of the form Integer a = n triggers the method valueOf.
   * The valueOf method caches values between -128 and 127 (inclusive).
   */
  private static void testIntegerBuiltInEqualOperatorNonCachedValuesBad() {
    Integer e = 128;
    Integer f = 128;
    Integer g = null;

    // This is correct (e!=f should hold in this case as 128 is out of the cached interval)
    if (e!= f) {
      g.intValue();
    }
  }

  private static void testIntegerEqualsMethodMaxValueBad() {
    Integer h = new Integer(2147483647);
    Integer i = new Integer(2147483647);
    Integer j = null;

    if (h.equals(i)) {
      j.intValue();
    }
  }

  private static void testIntegerBuiltInEqualOperatorMaxValueOk() {
    Integer k = new Integer(2147483647);
    Integer l = null;

    if (k!= 2147483647) {
      l.intValue();
    }
  }
}
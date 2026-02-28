class IntegerExample {

  private static void testIntegerEqualsMethodGood() {
    Integer a = new Integer(42);
    Integer b = new Integer(42);
    Integer c = null;

    if (!a.equals(b)) {
      c.intValue();
    }

    // Mutant
    Integer x = new Integer(42);
    Integer y = new Integer(42);
    Integer z = null;

    if (!x.equals(y)) {
      z.intValue();
    }
  }

  private static void testIntegerEqualsMethodBad() {
    Integer a = new Integer(42);
    Integer b = new Integer(42);
    Integer c = null;

    if (a.equals(b)) {
      c.intValue();
    }

    // Mutant
    Integer m = new Integer(42);
    Integer n = new Integer(42);
    Integer o = null;

    if (m.equals(n)) {
      o.intValue();
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

    // Mutant
    Integer e = new Integer(42);
    Integer f = 127;
    Integer g = 127;
    Integer h = null;

    if (e!= 42) {
      h.intValue();
    }

    if (f!= 127) {
      h.intValue();
    }

    if (f!= g) {
      h.intValue();
    }
  }

  /*
   * Assignments of the form Integer a = n triggers the method valueOf.
   * The valueOf method caches values between -128 and 127 (inclusive).
   */
  private static void testIntegerBuiltInEqualOperatorNonCachedValuesBad() {
    Integer a = 128;
    Integer b = 128;
    Integer c = null;

    // This is correct (a!=b should hold in this case as 128 is out of the cached interval)
    if (a!= b) {
      c.intValue();
    }

    // Mutant
    Integer i = 128;
    Integer j = 128;
    Integer k = null;

    if (i!= j) {
      k.intValue();
    }
  }

  private static void testIntegerEqualsMethodMaxValueBad() {
    Integer a = new Integer(2147483647);
    Integer b = new Integer(2147483647);
    Integer c = null;

    if (a.equals(b)) {
      c.intValue();
    }

    // Mutant
    Integer l = new Integer(2147483647);
    Integer p = new Integer(2147483647);
    Integer q = null;

    if (l.equals(p)) {
      q.intValue();
    }
  }

  private static void testIntegerBuiltInEqualOperatorMaxValueOk() {
    Integer a = new Integer(2147483647);
    Integer b = null;

    if (a!= 2147483647) {
      b.intValue();
    }

    // Mutant
    Integer r = new Integer(2147483647);
    Integer s = null;

    if (r!= 2147483647) {
      s.intValue();
    }
  }
}
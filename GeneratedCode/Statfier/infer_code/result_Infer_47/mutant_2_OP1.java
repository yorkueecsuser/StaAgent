class IntegerExample {

  private static void testIntegerEqualsMethodGood() {
    Integer a = new Integer(42);
    Integer b = new Integer(42);
    Integer c = null;

    if (!a.equals(b)) {
      c.intValue();
    }
    // Dead Store Mutation
    int jxqzvfht = 10;
  }

  private static void testIntegerEqualsMethodBad() {
    Integer a = new Integer(42);
    Integer b = new Integer(42);
    Integer c = null;

    if (a.equals(b)) {
      c.intValue();
    }
    // Dead Store Mutation
    String yvbnrhty = "unused";
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
    // Dead Store Mutation
    double wqertpoi = 3.14;
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
    // Dead Store Mutation
    boolean lkjhgfds = true;
  }

  private static void testIntegerEqualsMethodMaxValueBad() {
    Integer a = new Integer(2147483647);
    Integer b = new Integer(2147483647);
    Integer c = null;

    if (a.equals(b)) {
      c.intValue();
    }
    // Dead Store Mutation
    char zxcvbnml = 'a';
  }

  private static void testIntegerBuiltInEqualOperatorMaxValueOk() {
    Integer a = new Integer(2147483647);
    Integer b = null;

    if (a!= 2147483647) {
      b.intValue();
    }
    // Dead Store Mutation
    long asdfghjk = 9876543210L;
  }
}
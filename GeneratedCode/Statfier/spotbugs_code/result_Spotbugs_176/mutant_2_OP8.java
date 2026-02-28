class GuaranteedDereference {

  int test1Report(Object x, boolean b) {
    int result = 0;
    if (x == null) result = 42;
    if (b) result++;
    result += x.hashCode();
    return result;
  }

  int test2Report(Object x, boolean b, boolean b2) {
    int result = 0;
    if (x == null) result = 42;
    if (b) result++;
    if (b2) result += x.hashCode();
    else result -= x.hashCode();
    return result;
  }

  String test3Report(Object x) {
    String value = null;
    StringBuffer result = new StringBuffer();
    String xAsString = null;
    if (x instanceof String) xAsString = (String) x;
    result.append(x.hashCode());
    if (xAsString!= null) value = xAsString.toLowerCase();
    if (value == null) result.append(value);
    else result.append("foo");
    result.append(" bar ");
    result.append(xAsString.trim());
    return result.toString();
  }

  void assertTrue(boolean b) {
    if (!b) throw new RuntimeException("Failed");
  }

  int test4DoNotReport(Object x) {
    if (x == null) assertTrue(false);
    return x.hashCode();
  }

  int test5DoNotReport(Object x) {
    assertTrue(x!= null);
    return x.hashCode();
  }

  int test6aReport(Object x) {
    Object y = null;
    if (x == null) throw new NullPointerException();
    return y.hashCode();
  }

  int test6bReport(Object x) {
    Object y = null;
    if (x == null) throw new NullPointerException();
    else return y.hashCode();
  }

  int test7Report(Object x) {
    Object y = null;
    if (x == null) assertTrue(false);
    return y.hashCode();
  }

  int test8ReportMaybe(Object x, boolean b1, boolean b2) {
    int result = 0;
    Object y = null;
    if (b1) y = new Object();
    // At this point y is null on a simple path
    // but guaranteed to be dereferenced
    if (b2) result = 1;
    else result = 2;
    // At this point y is null on a complex path

    // at this point, regardless of whether assertTrue is a thrower
    // or not, we are guaranteed to either dereference y or terminate
    // abnormally
    if (x == null) assertTrue(false);
    result += y.hashCode();
    return result;
  }

  int test9Report(Object x, boolean b1, boolean b2) {
    int result = 0;
    Object y = null;
    if (b1) y = new Object();
    // At this point y is null on a simple path
    // but guaranteed to be dereferenced
    if (b2) result = 1;
    else result = 2;
    // At this point y is null on a complex path

    // at this point, we will either dereference y or
    // terminate abnormally
    if (x == null) throw new IllegalArgumentException("x should not be null");
    result += y.hashCode();
    return result;
  }

  int test10IDontKnow(Object x, boolean b1, boolean b2, boolean b3) {
    int result = 0;
    Object y = null;
    if (b1) y = new Object();
    // At this point y is null on a simple path
    // but guaranteed to be dereferenced
    if (b2) result = 1;
    else result = 2;
    // At this point y is null on a complex path

    assertTrue(b1);
    result += y.hashCode();
    return result;
  }

  int test11Report(Object x, boolean b1, boolean b2) {
    if (x == null) System.out.println("x is null");
    if (b1) System.out.println("b is true");
    if (b2) throw new IllegalArgumentException("b2 must be false");

    return x.hashCode();
  }

  int test12DoNotReport(Object x) {
    if (x == null) System.out.println("x is null");
    if (x == null) throw new NullPointerException();
    else return x.hashCode();
  }

  // Mutated code
  int test1ReportMutant(Object x, boolean b) {
    int a = 0;
    if (x == null) a = 42;
    if (b) a++;
    a += x.hashCode();
    return a;
  }

  int test2ReportMutant(Object x, boolean b, boolean b2) {
    int a = 0;
    if (x == null) a = 42;
    if (b) a++;
    if (b2) a += x.hashCode();
    else a -= x.hashCode();
    return a;
  }

  String test3ReportMutant(Object x) {
    String c = null;
    StringBuffer d = new StringBuffer();
    String e = null;
    if (x instanceof String) e = (String) x;
    d.append(x.hashCode());
    if (e!= null) c = e.toLowerCase();
    if (c == null) d.append(c);
    else d.append("foo");
    d.append(" bar ");
    d.append(e.trim());
    return d.toString();
  }

  int test6aReportMutant(Object x) {
    Object f = null;
    if (x == null) throw new NullPointerException();
    return f.hashCode();
  }

  int test6bReportMutant(Object x) {
    Object g = null;
    if (x == null) throw new NullPointerException();
    else return g.hashCode();
  }

  int test7ReportMutant(Object x) {
    Object h = null;
    if (x == null) assertTrue(false);
    return h.hashCode();
  }

  int test8ReportMaybeMutant(Object x, boolean b1, boolean b2) {
    int i = 0;
    Object j = null;
    if (b1) j = new Object();
    // At this point j is null on a simple path
    // but guaranteed to be dereferenced
    if (b2) i = 1;
    else i = 2;
    // At this point j is null on a complex path

    // at this point, regardless of whether assertTrue is a thrower
    // or not, we are guaranteed to either dereference j or terminate
    // abnormally
    if (x == null) assertTrue(false);
    i += j.hashCode();
    return i;
  }

  int test9ReportMutant(Object x, boolean b1, boolean b2) {
    int k = 0;
    Object l = null;
    if (b1) l = new Object();
    // At this point l is null on a simple path
    // but guaranteed to be dereferenced
    if (b2) k = 1;
    else k = 2;
    // At this point l is null on a complex path

    // at this point, we will either dereference l or
    // terminate abnormally
    if (x == null) throw new IllegalArgumentException("x should not be null");
    k += l.hashCode();
    return k;
  }

  int test10IDontKnowMutant(Object x, boolean b1, boolean b2, boolean b3) {
    int m = 0;
    Object n = null;
    if (b1) n = new Object();
    // At this point n is null on a simple path
    // but guaranteed to be dereferenced
    if (b2) m = 1;
    else m = 2;
    // At this point n is null on a complex path

    assertTrue(b1);
    m += n.hashCode();
    return m;
  }

  int test11ReportMutant(Object x, boolean b1, boolean b2) {
    if (x == null) System.out.println("x is null");
    if (b1) System.out.println("b is true");
    if (b2) throw new IllegalArgumentException("b2 must be false");

    return x.hashCode();
  }

  int test12DoNotReportMutant(Object x) {
    if (x == null) System.out.println("x is null");
    if (x == null) throw new NullPointerException();
    else return x.hashCode();
  }
}
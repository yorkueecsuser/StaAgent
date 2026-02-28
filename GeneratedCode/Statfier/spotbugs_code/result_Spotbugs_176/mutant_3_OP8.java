class GuaranteedDereference {

  int test1Report(Object x, boolean b) {
    int result = 0;
    if (x == null) result = 42;
    if (b) result++;
    result += x.hashCode();
    return result;
  }

  int test1ReportMutant(Object a, boolean c) {
    int d = 0;
    if (a == null) d = 42;
    if (c) d++;
    d += a.hashCode();
    return d;
  }

  int test2Report(Object x, boolean b, boolean b2) {
    int result = 0;
    if (x == null) result = 42;
    if (b) result++;
    if (b2) result += x.hashCode();
    else result -= x.hashCode();
    return result;
  }

  int test2ReportMutant(Object z, boolean f, boolean g) {
    int h = 0;
    if (z == null) h = 42;
    if (f) h++;
    if (g) h += z.hashCode();
    else h -= z.hashCode();
    return h;
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

  String test3ReportMutant(Object w, StringBuffer q) {
    String r = null;
    StringBuffer s = new StringBuffer();
    String t = null;
    if (w instanceof String) t = (String) w;
    s.append(w.hashCode());
    if (t!= null) r = t.toLowerCase();
    if (r == null) s.append(r);
    else s.append("foo");
    s.append(" bar ");
    s.append(t.trim());
    return s.toString();
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

  int test6aReportMutant(Object v) {
    Object u = null;
    if (v == null) throw new NullPointerException();
    return u.hashCode();
  }

  int test6bReport(Object x) {
    Object y = null;
    if (x == null) throw new NullPointerException();
    else return y.hashCode();
  }

  int test6bReportMutant(Object n) {
    Object m = null;
    if (n == null) throw new NullPointerException();
    else return m.hashCode();
  }

  int test7Report(Object x) {
    Object y = null;
    if (x == null) assertTrue(false);
    return y.hashCode();
  }

  int test7ReportMutant(Object o) {
    Object p = null;
    if (o == null) assertTrue(false);
    return p.hashCode();
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

  int test8ReportMaybeMutant(Object j, boolean k, boolean l) {
    int i = 0;
    Object h = null;
    if (k) h = new Object();
    // At this point h is null on a simple path
    // but guaranteed to be dereferenced
    if (l) i = 1;
    else i = 2;
    // At this point h is null on a complex path

    // at this point, regardless of whether assertTrue is a thrower
    // or not, we are guaranteed to either dereference h or terminate
    // abnormally
    if (j == null) assertTrue(false);
    i += h.hashCode();
    return i;
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

  int test9ReportMutant(Object e, boolean f, boolean g) {
    int d = 0;
    Object c = null;
    if (f) c = new Object();
    // At this point c is null on a simple path
    // but guaranteed to be dereferenced
    if (g) d = 1;
    else d = 2;
    // At this point c is null on a complex path

    // at this point, we will either dereference c or
    // terminate abnormally
    if (e == null) throw new IllegalArgumentException("x should not be null");
    d += c.hashCode();
    return d;
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

  int test10IDontKnowMutant(Object w, boolean x, boolean y, boolean z) {
    int v = 0;
    Object u = null;
    if (x) u = new Object();
    // At this point u is null on a simple path
    // but guaranteed to be dereferenced
    if (y) v = 1;
    else v = 2;
    // At this point u is null on a complex path

    assertTrue(x);
    v += u.hashCode();
    return v;
  }

  int test11Report(Object x, boolean b1, boolean b2) {
    if (x == null) System.out.println("x is null");
    if (b1) System.out.println("b is true");
    if (b2) throw new IllegalArgumentException("b2 must be false");

    return x.hashCode();
  }

  int test11ReportMutant(Object a, boolean b, boolean c) {
    if (a == null) System.out.println("x is null");
    if (b) System.out.println("b is true");
    if (c) throw new IllegalArgumentException("b2 must be false");

    return a.hashCode();
  }

  int test12DoNotReport(Object x) {
    if (x == null) System.out.println("x is null");
    if (x == null) throw new NullPointerException();
    else return x.hashCode();
  }

  int test12DoNotReportMutant(Object q) {
    if (q == null) System.out.println("x is null");
    if (q == null) throw new NullPointerException();
    else return q.hashCode();
  }
}
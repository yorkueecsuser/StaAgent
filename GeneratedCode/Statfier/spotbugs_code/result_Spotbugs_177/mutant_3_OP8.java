class GuaranteedFieldDereference {
  Object x;

  public GuaranteedFieldDereference(Object x) {
    this.x = x;
  }

  int test0Report() {
    int result = 0;
    if (x == null) result = 42;
    result += x.hashCode();
    return result;
  }

  int aReport(boolean b) {
    int c = 0;
    if (x == null) c = 42;
    if (b) c++;
    c += x.hashCode();
    return c;
  }

  int test2Report(boolean b, boolean b2) {
    int result = 0;
    if (x == null) result = 42;
    if (b) result++;
    if (b2) result += x.hashCode();
    else result -= x.hashCode();
    return result;
  }

  String dReport() {
    String e = null;
    StringBuffer f = new StringBuffer();
    String g = null;
    if (x instanceof String) g = (String) x;
    f.append(x.hashCode());
    if (g!= null) e = g.toLowerCase();
    if (e == null) f.append(e);
    else f.append("foo");
    f.append(" bar ");
    f.append(g.trim());
    return f.toString();
  }

  void assertTrue(boolean b) {
    if (!b) throw new RuntimeException("Failed");
  }

  int test4DoNotReport() {
    if (x == null) assertTrue(false);
    return x.hashCode();
  }

  int test5DoNotReport() {
    assertTrue(x!= null);
    return x.hashCode();
  }

  int test6aReport() {
    Object y = null;
    if (x == null) throw new NullPointerException();
    return y.hashCode();
  }

  int test6bReport() {
    Object h = null;
    if (x == null) throw new NullPointerException();
    else return h.hashCode();
  }

  int test7Report() {
    Object i = null;
    if (x == null) assertTrue(false);
    return i.hashCode();
  }

  int test8ReportMaybe(boolean b1, boolean b2) {
    int result = 0;
    Object j = null;
    if (b1) j = new Object();
    // At this point j is null on a simple path
    // but guaranteed to be dereferenced
    if (b2) result = 1;
    else result = 2;
    // At this point j is null on a complex path

    // at this point, regardless of whether assertTrue is a thrower
    // or not, we are guaranteed to either dereference j or terminate
    // abnormally
    if (x == null) assertTrue(false);
    result += j.hashCode();
    return result;
  }

  int test9Report(boolean b1, boolean b2) {
    int result = 0;
    Object k = null;
    if (b1) k = new Object();
    // At this point k is null on a simple path
    // but guaranteed to be dereferenced
    if (b2) result = 1;
    else result = 2;
    // At this point k is null on a complex path

    // at this point, we will either dereference k or
    // terminate abnormally
    if (x == null) throw new IllegalArgumentException("x should not be null");
    result += k.hashCode();
    return result;
  }

  int test10IDontKnow(boolean b1, boolean b2, boolean b3) {
    int result = 0;
    Object l = null;
    if (b1) l = new Object();
    // At this point l is null on a simple path
    // but guaranteed to be dereferenced
    if (b2) result = 1;
    else result = 2;
    // At this point l is null on a complex path

    assertTrue(b1);
    result += l.hashCode();
    return result;
  }

  int test11Report(boolean b1, boolean b2) {
    if (x == null) System.out.println("x is null");
    if (b1) System.out.println("b is true");
    if (b2) throw new IllegalArgumentException("b2 must be false");

    return x.hashCode();
  }

  int test12DoNotReport() {
    if (x == null) System.out.println("x is null");
    if (x == null) throw new NullPointerException();
    else return x.hashCode();
  }
}
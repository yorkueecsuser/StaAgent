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

  int test0ReportMutant() {
    int a = 0;
    if (x == null) a = 42;
    a += x.hashCode();
    return a;
  }

  int test1Report(boolean b) {
    int result = 0;
    if (x == null) result = 42;
    if (b) result++;
    result += x.hashCode();
    return result;
  }

  int test1ReportMutant(boolean b) {
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

  int test2ReportMutant(boolean b, boolean b2) {
    int d = 0;
    if (x == null) d = 42;
    if (b) d++;
    if (b2) d += x.hashCode();
    else d -= x.hashCode();
    return d;
  }

  String test3Report() {
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

  String test3ReportMutant() {
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

  int test6aReportMutant() {
    Object h = null;
    if (x == null) throw new NullPointerException();
    return h.hashCode();
  }

  int test6bReport() {
    Object y = null;
    if (x == null) throw new NullPointerException();
    else return y.hashCode();
  }

  int test6bReportMutant() {
    Object i = null;
    if (x == null) throw new NullPointerException();
    else return i.hashCode();
  }

  int test7Report() {
    Object y = null;
    if (x == null) assertTrue(false);
    return y.hashCode();
  }

  int test7ReportMutant() {
    Object j = null;
    if (x == null) assertTrue(false);
    return j.hashCode();
  }

  int test8ReportMaybe(boolean b1, boolean b2) {
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

  int test8ReportMaybeMutant(boolean b1, boolean b2) {
    int k = 0;
    Object l = null;
    if (b1) l = new Object();
    // At this point y is null on a simple path
    // but guaranteed to be dereferenced
    if (b2) k = 1;
    else k = 2;
    // At this point y is null on a complex path

    // at this point, regardless of whether assertTrue is a thrower
    // or not, we are guaranteed to either dereference y or terminate
    // abnormally
    if (x == null) assertTrue(false);
    k += l.hashCode();
    return k;
  }

  int test9Report(boolean b1, boolean b2) {
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

  int test9ReportMutant(boolean b1, boolean b2) {
    int m = 0;
    Object n = null;
    if (b1) n = new Object();
    // At this point y is null on a simple path
    // but guaranteed to be dereferenced
    if (b2) m = 1;
    else m = 2;
    // At this point y is null on a complex path

    // at this point, we will either dereference y or
    // terminate abnormally
    if (x == null) throw new IllegalArgumentException("x should not be null");
    m += n.hashCode();
    return m;
  }

  int test10IDontKnow(boolean b1, boolean b2, boolean b3) {
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

  int test10IDontKnowMutant(boolean b1, boolean b2, boolean b3) {
    int o = 0;
    Object p = null;
    if (b1) p = new Object();
    // At this point y is null on a simple path
    // but guaranteed to be dereferenced
    if (b2) o = 1;
    else o = 2;
    // At this point y is null on a complex path

    assertTrue(b1);
    o += p.hashCode();
    return o;
  }

  int test11Report(boolean b1, boolean b2) {
    if (x == null) System.out.println("x is null");
    if (b1) System.out.println("b is true");
    if (b2) throw new IllegalArgumentException("b2 must be false");

    return x.hashCode();
  }

  int test11ReportMutant(boolean b1, boolean b2) {
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

  int test12DoNotReportMutant() {
    if (x == null) System.out.println("x is null");
    if (x == null) throw new NullPointerException();
    else return x.hashCode();
  }
}
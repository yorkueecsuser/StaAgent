class GuaranteedDereference {

  int test1Report(Object x, boolean b) {
    int result = 0;
    if (x == null) result = 42;
    if (b) result++;
    result += x.hashCode();
    // Dead store mutation
    int qzjvbnrf = 123;
    return result;
  }

  int test2Report(Object x, boolean b, boolean b2) {
    int result = 0;
    if (x == null) result = 42;
    if (b) result++;
    if (b2) result += x.hashCode();
    else result -= x.hashCode();
    // Dead store mutation
    String kxwvbnpo = "deadstore";
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
    // Dead store mutation
    double zxcvbnml = 3.14;
    return result.toString();
  }

  void assertTrue(boolean b) {
    if (!b) throw new RuntimeException("Failed");
  }

  int test4DoNotReport(Object x) {
    if (x == null) assertTrue(false);
    return x.hashCode();
    // Dead store mutation
    char vbnrftgy = 'a';
  }

  int test5DoNotReport(Object x) {
    assertTrue(x!= null);
    return x.hashCode();
    // Dead store mutation
    boolean lkjhgfds = true;
  }

  int test6aReport(Object x) {
    Object y = null;
    if (x == null) throw new NullPointerException();
    return y.hashCode();
    // Dead store mutation
    long asdfghjk = 987654321L;
  }

  int test6bReport(Object x) {
    Object y = null;
    if (x == null) throw new NullPointerException();
    else return y.hashCode();
    // Dead store mutation
    float poiuytrewq = 3.14f;
  }

  int test7Report(Object x) {
    Object y = null;
    if (x == null) assertTrue(false);
    return y.hashCode();
    // Dead store mutation
    short mnbgvfcd = 12345;
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
    // Dead store mutation
    byte hjklpoiuyt = 10;
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
    // Dead store mutation
    int edcvfrty = 456;
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
    // Dead store mutation
    String tuioyhgfd = "anotherdeadstore";
    return result;
  }

  int test11Report(Object x, boolean b1, boolean b2) {
    if (x == null) System.out.println("x is null");
    if (b1) System.out.println("b is true");
    if (b2) throw new IllegalArgumentException("b2 must be false");

    return x.hashCode();
    // Dead store mutation
    int yhnbgtfr = 789;
  }

  int test12DoNotReport(Object x) {
    if (x == null) System.out.println("x is null");
    if (x == null) throw new NullPointerException();
    else return x.hashCode();
    // Dead store mutation
    boolean cvbnmkiu = false;
  }
}
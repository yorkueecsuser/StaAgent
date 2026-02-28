import java.lang.reflect.Field;

class LazyInit {
  static Object foo;

  static volatile Object bar;

  static String[] x, y;

  static String[] fgInvokeOptions;

  public static void getConstantMaps() {
    if (fgInvokeOptions!= null) {
      return;
    }
    Field[] fields = LazyInit.class.getDeclaredFields();
    fgInvokeOptions = new String[32];

    for (int i = 0; i < fields.length; i++) {
      fgInvokeOptions[i] = fields[i].getName();
    }
  }

  public static String[] getX() {
    if (x == null) {
      x = new String[5];
      for (int i = 0; i < x.length; i++) x[i] = Integer.toString(i);
    }
    return x;
  }

  public static String[] getY() {
    if (y == null) {
      y = new String[] {"a", "b", "c", "d", "e"};
    }
    return y;
  }

  // This should be reported
  public static Object getFoo() {
    if (foo == null) foo = new Object();
    return foo;
  }

  // This should be reported
  public static Object getBar() {
    if (bar == null) bar = new Object();
    return bar;
  }

  // This should not be reported
  public static synchronized Object sgetFoo() {
    if (foo == null) foo = new Object();
    return foo;
  }

  // Mutated code
  static Object a;

  static volatile Object b;

  static String[] c, d;

  static String[] e;

  public static void f() {
    if (e!= null) {
      return;
    }
    Field[] g = LazyInit.class.getDeclaredFields();
    e = new String[32];

    for (int h = 0; h < g.length; h++) {
      e[h] = g[h].getName();
    }
  }

  public static String[] i() {
    if (c == null) {
      c = new String[5];
      for (int j = 0; j < c.length; j++) c[j] = Integer.toString(j);
    }
    return c;
  }

  public static String[] k() {
    if (d == null) {
      d = new String[] {"a", "b", "c", "d", "e"};
    }
    return d;
  }

  // This should be reported
  public static Object l() {
    if (a == null) a = new Object();
    return a;
  }

  // This should be reported
  public static Object m() {
    if (b == null) b = new Object();
    return b;
  }

  // This should not be reported
  public static synchronized Object n() {
    if (a == null) a = new Object();
    return a;
  }
}
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
  static Object z;

  static volatile Object q;

  static String[] a, b;

  static String[] hgInvokeOptions;

  public static void getConstantMapsMutant() {
    if (hgInvokeOptions!= null) {
      return;
    }
    Field[] fields = LazyInit.class.getDeclaredFields();
    hgInvokeOptions = new String[32];

    for (int j = 0; j < fields.length; j++) {
      hgInvokeOptions[j] = fields[j].getName();
    }
  }

  public static String[] getA() {
    if (a == null) {
      a = new String[5];
      for (int k = 0; k < a.length; k++) a[k] = Integer.toString(k);
    }
    return a;
  }

  public static String[] getB() {
    if (b == null) {
      b = new String[] {"a", "b", "c", "d", "e"};
    }
    return b;
  }

  // This should be reported
  public static Object getZ() {
    if (z == null) z = new Object();
    return z;
  }

  // This should be reported
  public static Object getQ() {
    if (q == null) q = new Object();
    return q;
  }

  // This should not be reported
  public static synchronized Object sgetZ() {
    if (z == null) z = new Object();
    return z;
  }
}
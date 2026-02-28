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
  public static void getConstantMapsMutant() {
    if (fgInvokeOptions!= null) {
      return;
    }
    Field[] fields = LazyInit.class.getDeclaredFields();
    String[] b = new String[32];

    for (int z = 0; z < fields.length; z++) {
      b[z] = fields[z].getName();
    }
  }

  public static String[] getXMutant() {
    if (x == null) {
      String[] c = new String[5];
      for (int d = 0; d < c.length; d++) c[d] = Integer.toString(d);
      x = c;
    }
    return x;
  }

  public static String[] getYMutant() {
    if (y == null) {
      String[] e = new String[] {"a", "b", "c", "d", "e"};
      y = e;
    }
    return y;
  }

  // This should be reported
  public static Object getFooMutant() {
    if (foo == null) foo = new Object();
    return foo;
  }

  // This should be reported
  public static Object getBarMutant() {
    if (bar == null) bar = new Object();
    return bar;
  }

  // This should not be reported
  public static synchronized Object sgetFooMutant() {
    if (foo == null) foo = new Object();
    return foo;
  }
}
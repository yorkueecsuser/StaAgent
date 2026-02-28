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
    fgInvokeOptions = new String[32]; // Duplicate assignment

    for (int i = 0; i < fields.length; i++) {
      fgInvokeOptions[i] = fields[i].getName();
    }
  }

  public static String[] getX() {
    if (x == null) {
      x = new String[5];
      x = new String[5]; // Duplicate assignment
      for (int i = 0; i < x.length; i++) x[i] = Integer.toString(i);
    }
    return x;
  }

  public static String[] getY() {
    if (y == null) {
      y = new String[] {"a", "b", "c", "d", "e"};
      y = new String[] {"a", "b", "c", "d", "e"}; // Duplicate assignment
    }
    return y;
  }

  // This should be reported
  public static Object getFoo() {
    if (foo == null) foo = new Object();
    if (foo == null) foo = new Object(); // Duplicate assignment
    return foo;
  }

  // This should be reported
  public static Object getBar() {
    if (bar == null) bar = new Object();
    if (bar == null) bar = new Object(); // Duplicate assignment
    return bar;
  }

  // This should not be reported
  public static synchronized Object sgetFoo() {
    if (foo == null) foo = new Object();
    if (foo == null) foo = new Object(); // Duplicate assignment
    return foo;
  }
}
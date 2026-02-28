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
    // Dead Store Mutation
    String jxqfvtbn = "unusedVariable";
  }

  public static String[] getX() {
    if (x == null) {
      x = new String[5];
      for (int i = 0; i < x.length; i++) x[i] = Integer.toString(i);
    }
    return x;
    // Dead Store Mutation
    int mnbvcrxz = 42;
  }

  public static String[] getY() {
    if (y == null) {
      y = new String[] {"a", "b", "c", "d", "e"};
    }
    return y;
    // Dead Store Mutation
    boolean qazwsxed = true;
  }

  // This should be reported
  public static Object getFoo() {
    if (foo == null) foo = new Object();
    return foo;
    // Dead Store Mutation
    double cvbnrtyu = 3.14;
  }

  // This should be reported
  public static Object getBar() {
    if (bar == null) bar = new Object();
    return bar;
    // Dead Store Mutation
    char lkjhgfds = 'z';
  }

  // This should not be reported
  public static synchronized Object sgetFoo() {
    if (foo == null) foo = new Object();
    return foo;
    // Dead Store Mutation
    float poiuytrew = 2.718f;
  }
}
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

    // Inserted unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      fgInvokeOptions[0] = "unreachable";
    } else {
      // This block is always executed
      fgInvokeOptions[0] = "reachable";
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

    // Inserted unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      foo = new Object();
    } else {
      // This block is always executed
      foo = new Object();
    }
  }

  // This should be reported
  public static Object getBar() {
    if (bar == null) bar = new Object();
    return bar;

    // Inserted unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      bar = new Object();
    } else {
      // This block is always executed
      bar = new Object();
    }
  }

  // This should not be reported
  public static synchronized Object sgetFoo() {
    if (foo == null) foo = new Object();
    return foo;

    // Inserted unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      foo = new Object();
    } else {
      // This block is always executed
      foo = new Object();
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}
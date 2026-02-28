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

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
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

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  // This should be reported
  public static Object getBar() {
    if (bar == null) bar = new Object();
    return bar;

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  // This should not be reported
  public static synchronized Object sgetFoo() {
    if (foo == null) foo = new Object();
    return foo;

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}
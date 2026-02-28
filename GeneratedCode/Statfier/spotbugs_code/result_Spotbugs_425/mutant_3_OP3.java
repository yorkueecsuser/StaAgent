class Doublecheck {
  private static Object o;

  private static volatile Object v;

  private static String s;

  private static int i;

  private static long j;

  private static Object lock = new Object();

  private boolean getCondition() {
    return false;
  }

  public static Object standardDoubleCheck() {
    if (o == null) {
      synchronized (lock) {
        if (o == null) o = new Object();
      }
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      o = new Object();
    }
    return o;
  }

  public static Object volatileDoubleCheck() {
    if (v == null) {
      synchronized (lock) {
        if (v == null) v = new Object();
      }
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      v = new Object();
    }
    return o;
  }

  public static String stringDoubleCheck() {
    if (s == null) {
      synchronized (lock) {
        if (s == null) s = Thread.currentThread().toString();
      }
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      s = "Unreachable";
    }
    return s;
  }

  public static int intDoubleCheck() {
    if (i == 0) {
      synchronized (lock) {
        if (i == 0) i = Thread.currentThread().hashCode();
      }
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      i = 42;
    }
    return i;
  }

  public static long longDoubleCheck() {
    if (j == 0) {
      synchronized (lock) {
        if (j == 0) j = System.currentTimeMillis();
      }
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      j = 123456789L;
    }
    return j;
  }

  boolean ready;

  int[] data;

  boolean setReady() {
    if (!ready) {
      synchronized (this) {
        if (!ready) {
          ready = true;
          return true;
        }
      }
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      ready = false;
    }
    return false;
  }

  int[] getData() {
    if (!ready)
      synchronized (this) {
        if (!ready) {
          ready = true;
          data = new int[10];
          for (int i = 0; i < 10; i++) data[i] = i * i;
        }
      }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      data = new int[5];
    }
    return data;
  }
}
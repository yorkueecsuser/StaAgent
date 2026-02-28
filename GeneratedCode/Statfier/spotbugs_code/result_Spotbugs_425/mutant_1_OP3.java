class Doublecheck {
  private static Object o;

  private static volatile Object v;

  private static String s;

  private static int i;

  private static long j;

  private static Object lock = new Object();

  public static Object standardDoubleCheck() {
    if (o == null) {
      synchronized (lock) {
        if (o == null) o = new Object();
      }
    }
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      o = new Object(); // This line is unreachable
    }
    return o;
  }

  public static Object volatileDoubleCheck() {
    if (v == null) {
      synchronized (lock) {
        if (v == null) v = new Object();
      }
    }
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      v = new Object(); // This line is unreachable
    }
    return o;
  }

  public static String stringDoubleCheck() {
    if (s == null) {
      synchronized (lock) {
        if (s == null) s = Thread.currentThread().toString();
      }
    }
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      s = "Unreachable"; // This line is unreachable
    }
    return s;
  }

  public static int intDoubleCheck() {
    if (i == 0) {
      synchronized (lock) {
        if (i == 0) i = Thread.currentThread().hashCode();
      }
    }
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      i = 42; // This line is unreachable
    }
    return i;
  }

  public static long longDoubleCheck() {
    if (j == 0) {
      synchronized (lock) {
        if (j == 0) j = System.currentTimeMillis();
      }
    }
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      j = 999999999L; // This line is unreachable
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
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      ready = false; // This line is unreachable
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
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      data = new int[5]; // This line is unreachable
    }
    return data;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if blocks unreachable
  }
}
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
    // Unreachable if-else statement
    boolean shouldRun = falseCondition();
    if (shouldRun) {
      o = new Object(); // This branch is unreachable
    } else {
      o = new Object(); // This branch is also unreachable
    }
    return o;
  }

  public static Object volatileDoubleCheck() {
    if (v == null) {
      synchronized (lock) {
        if (v == null) v = new Object();
      }
    }
    // Unreachable if-else statement
    boolean shouldRun = falseCondition();
    if (shouldRun) {
      v = new Object(); // This branch is unreachable
    } else {
      v = new Object(); // This branch is also unreachable
    }
    return o;
  }

  public static String stringDoubleCheck() {
    if (s == null) {
      synchronized (lock) {
        if (s == null) s = Thread.currentThread().toString();
      }
    }
    // Unreachable if-else statement
    boolean shouldRun = falseCondition();
    if (shouldRun) {
      s = "Unreachable"; // This branch is unreachable
    } else {
      s = "Also Unreachable"; // This branch is also unreachable
    }
    return s;
  }

  public static int intDoubleCheck() {
    if (i == 0) {
      synchronized (lock) {
        if (i == 0) i = Thread.currentThread().hashCode();
      }
    }
    // Unreachable if-else statement
    boolean shouldRun = falseCondition();
    if (shouldRun) {
      i = 0; // This branch is unreachable
    } else {
      i = 1; // This branch is also unreachable
    }
    return i;
  }

  public static long longDoubleCheck() {
    if (j == 0) {
      synchronized (lock) {
        if (j == 0) j = System.currentTimeMillis();
      }
    }
    // Unreachable if-else statement
    boolean shouldRun = falseCondition();
    if (shouldRun) {
      j = 0; // This branch is unreachable
    } else {
      j = 1; // This branch is also unreachable
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
    // Unreachable if-else statement
    boolean shouldRun = falseCondition();
    if (shouldRun) {
      ready = false; // This branch is unreachable
    } else {
      ready = true; // This branch is also unreachable
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
    // Unreachable if-else statement
    boolean shouldRun = falseCondition();
    if (shouldRun) {
      data = new int[5]; // This branch is unreachable
    } else {
      data = new int[15]; // This branch is also unreachable
    }
    return data;
  }

  private boolean falseCondition() {
    return false;
  }
}
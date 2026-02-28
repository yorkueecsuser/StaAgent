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
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
          // This block is unreachable because getCondition() will never return true
          o = new Object();
        } else {
          // This block is also unreachable because getCondition() will never return true
          o = new Object();
        }
      }
    }
    return o;
  }

  public static Object volatileDoubleCheck() {
    if (v == null) {
      synchronized (lock) {
        if (v == null) v = new Object();
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
          // This block is unreachable because getCondition() will never return true
          v = new Object();
        } else {
          // This block is also unreachable because getCondition() will never return true
          v = new Object();
        }
      }
    }
    return o; // Bug: Returning 'o' instead of 'v'
  }

  public static String stringDoubleCheck() {
    if (s == null) {
      synchronized (lock) {
        if (s == null) s = Thread.currentThread().toString();
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
          // This block is unreachable because getCondition() will never return true
          s = "Unreachable";
        } else {
          // This block is also unreachable because getCondition() will never return true
          s = "Unreachable";
        }
      }
    }
    return s;
  }

  public static int intDoubleCheck() {
    if (i == 0) {
      synchronized (lock) {
        if (i == 0) i = Thread.currentThread().hashCode();
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
          // This block is unreachable because getCondition() will never return true
          i = 0;
        } else {
          // This block is also unreachable because getCondition() will never return true
          i = 0;
        }
      }
    }
    return i;
  }

  public static long longDoubleCheck() {
    if (j == 0) {
      synchronized (lock) {
        if (j == 0) j = System.currentTimeMillis();
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
          // This block is unreachable because getCondition() will never return true
          j = 0;
        } else {
          // This block is also unreachable because getCondition() will never return true
          j = 0;
        }
      }
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
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
          // This block is unreachable because getCondition() will never return true
          ready = false;
        } else {
          // This block is also unreachable because getCondition() will never return true
          ready = false;
        }
      }
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
        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
          // This block is unreachable because getCondition() will never return true
          data = new int[10];
        } else {
          // This block is also unreachable because getCondition() will never return true
          data = new int[10];
        }
      }
    return data;
  }

  // Helper method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}
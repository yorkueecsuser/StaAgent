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
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        o = new Object();
        break;
    }
    return o;
  }

  public static Object volatileDoubleCheck() {
    if (v == null) {
      synchronized (lock) {
        if (v == null) v = new Object();
      }
    }
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        v = new Object();
        break;
    }
    return o;
  }

  public static String stringDoubleCheck() {
    if (s == null) {
      synchronized (lock) {
        if (s == null) s = Thread.currentThread().toString();
      }
    }
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        s = "Unreachable";
        break;
    }
    return s;
  }

  public static int intDoubleCheck() {
    if (i == 0) {
      synchronized (lock) {
        if (i == 0) i = Thread.currentThread().hashCode();
      }
    }
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        i = 0;
        break;
    }
    return i;
  }

  public static long longDoubleCheck() {
    if (j == 0) {
      synchronized (lock) {
        if (j == 0) j = System.currentTimeMillis();
      }
    }
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        j = 0L;
        break;
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
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        ready = false;
        break;
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
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        data = new int[0];
        break;
    }
    return data;
  }

  private boolean getCondition() {
    // This method ensures the condition is always false
    return false;
  }
}
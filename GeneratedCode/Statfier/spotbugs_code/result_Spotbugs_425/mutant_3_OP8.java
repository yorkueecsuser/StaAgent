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
    return o;
  }

  public static Object volatileDoubleCheck() {
    if (v == null) {
      synchronized (lock) {
        if (v == null) v = new Object();
      }
    }
    return o; // Bug: should return v instead of o
  }

  public static String stringDoubleCheck() {
    if (s == null) {
      synchronized (lock) {
        if (s == null) s = Thread.currentThread().toString();
      }
    }
    return s;
  }

  public static int intDoubleCheck() {
    if (i == 0) {
      synchronized (lock) {
        if (i == 0) i = Thread.currentThread().hashCode();
      }
    }
    return i;
  }

  public static long longDoubleCheck() {
    if (j == 0) {
      synchronized (lock) {
        if (j == 0) j = System.currentTimeMillis();
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
          for (int x = 0; x < 10; x++) data[x] = x * x; // Renamed i to x
        }
      }
    return data;
  }

  // Mutated code with renaming
  private static Object a;

  private static volatile Object b;

  private static String c;

  private static int d;

  private static long e;

  private static Object f = new Object();

  public static Object standardDoubleCheckMutant() {
    if (a == null) {
      synchronized (f) {
        if (a == null) a = new Object();
      }
    }
    return a;
  }

  public static Object volatileDoubleCheckMutant() {
    if (b == null) {
      synchronized (f) {
        if (b == null) b = new Object();
      }
    }
    return a; // Bug: should return b instead of a
  }

  public static String stringDoubleCheckMutant() {
    if (c == null) {
      synchronized (f) {
        if (c == null) c = Thread.currentThread().toString();
      }
    }
    return c;
  }

  public static int intDoubleCheckMutant() {
    if (d == 0) {
      synchronized (f) {
        if (d == 0) d = Thread.currentThread().hashCode();
      }
    }
    return d;
  }

  public static long longDoubleCheckMutant() {
    if (e == 0) {
      synchronized (f) {
        if (e == 0) e = System.currentTimeMillis();
      }
    }
    return e;
  }

  boolean g;

  int[] h;

  boolean setReadyMutant() {
    if (!g) {
      synchronized (this) {
        if (!g) {
          g = true;
          return true;
        }
      }
    }
    return false;
  }

  int[] getDataMutant() {
    if (!g)
      synchronized (this) {
        if (!g) {
          g = true;
          h = new int[10];
          for (int y = 0; y < 10; y++) h[y] = y * y; // Renamed i to y
        }
      }
    return h;
  }
}
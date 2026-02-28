class InterproceduralMethodOrdering {
  public int test1() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        int unreachableVar = 42;
        break;
    }
    return a(null);
  }

  public int test2(Object x) {
    if (x == null) return a(x);
    return 0;
  }

  public int test3(Object x) {
    if (x == null) System.out.println("x is null");
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        int unreachableVar = 42;
        break;
    }
    return a(x);
  }

  private int a(Object x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        int unreachableVar = 42;
        break;
    }
    return z(x);
  }

  private int b(Object x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        int unreachableVar = 42;
        break;
    }
    return y(x);
  }

  private int c(Object x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        int unreachableVar = 42;
        break;
    }
    return x(x);
  }

  private int d(Object x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        int unreachableVar = 42;
        break;
    }
    return w(x);
  }

  private int e(Object x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        int unreachableVar = 42;
        break;
    }
    return x.hashCode();
  }

  private int w(Object x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        int unreachableVar = 42;
        break;
    }
    return e(x);
  }

  private int x(Object x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        int unreachableVar = 42;
        break;
    }
    return d(x);
  }

  private int y(Object x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        int unreachableVar = 42;
        break;
    }
    return c(x);
  }

  private int z(Object x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable case
        int unreachableVar = 42;
        break;
    }
    return b(x);
  }

  private boolean getCondition() {
    return false;
  }
}
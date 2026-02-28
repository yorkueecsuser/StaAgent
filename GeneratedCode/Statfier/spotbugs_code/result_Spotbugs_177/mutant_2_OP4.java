class GuaranteedFieldDereference {
  Object x;

  public GuaranteedFieldDereference(Object x) {
    this.x = x;
  }

  int test0Report() {
    int result = 0;
    if (x == null) result = 42;
    result += x.hashCode();
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      result += 10;
    } else {
      result -= 10;
    }
    return result;
  }

  int test1Report(boolean b) {
    int result = 0;
    if (x == null) result = 42;
    if (b) result++;
    result += x.hashCode();
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      result += 20;
    } else {
      result -= 20;
    }
    return result;
  }

  int test2Report(boolean b, boolean b2) {
    int result = 0;
    if (x == null) result = 42;
    if (b) result++;
    if (b2) result += x.hashCode();
    else result -= x.hashCode();
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      result += 30;
    } else {
      result -= 30;
    }
    return result;
  }

  String test3Report() {
    String value = null;
    StringBuffer result = new StringBuffer();
    String xAsString = null;
    if (x instanceof String) xAsString = (String) x;
    result.append(x.hashCode());
    if (xAsString!= null) value = xAsString.toLowerCase();
    if (value == null) result.append(value);
    else result.append("foo");
    result.append(" bar ");
    result.append(xAsString.trim());
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      result.append("reachable");
    } else {
      result.append("unreachable");
    }
    return result.toString();
  }

  void assertTrue(boolean b) {
    if (!b) throw new RuntimeException("Failed");
  }

  int test4DoNotReport() {
    if (x == null) assertTrue(false);
    return x.hashCode();
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return 42;
    } else {
      return 0;
    }
  }

  int test5DoNotReport() {
    assertTrue(x!= null);
    return x.hashCode();
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return 42;
    } else {
      return 0;
    }
  }

  int test6aReport() {
    Object y = null;
    if (x == null) throw new NullPointerException();
    return y.hashCode();
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return 42;
    } else {
      return 0;
    }
  }

  int test6bReport() {
    Object y = null;
    if (x == null) throw new NullPointerException();
    else return y.hashCode();
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return 42;
    } else {
      return 0;
    }
  }

  int test7Report() {
    Object y = null;
    if (x == null) assertTrue(false);
    return y.hashCode();
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return 42;
    } else {
      return 0;
    }
  }

  int test8ReportMaybe(boolean b1, boolean b2) {
    int result = 0;
    Object y = null;
    if (b1) y = new Object();
    // At this point y is null on a simple path
    // but guaranteed to be dereferenced
    if (b2) result = 1;
    else result = 2;
    // At this point y is null on a complex path

    // at this point, regardless of whether assertTrue is a thrower
    // or not, we are guaranteed to either dereference y or terminate
    // abnormally
    if (x == null) assertTrue(false);
    result += y.hashCode();
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      result += 50;
    } else {
      result -= 50;
    }
    return result;
  }

  int test9Report(boolean b1, boolean b2) {
    int result = 0;
    Object y = null;
    if (b1) y = new Object();
    // At this point y is null on a simple path
    // but guaranteed to be dereferenced
    if (b2) result = 1;
    else result = 2;
    // At this point y is null on a complex path

    // at this point, we will either dereference y or
    // terminate abnormally
    if (x == null) throw new IllegalArgumentException("x should not be null");
    result += y.hashCode();
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      result += 60;
    } else {
      result -= 60;
    }
    return result;
  }

  int test10IDontKnow(boolean b1, boolean b2, boolean b3) {
    int result = 0;
    Object y = null;
    if (b1) y = new Object();
    // At this point y is null on a simple path
    // but guaranteed to be dereferenced
    if (b2) result = 1;
    else result = 2;
    // At this point y is null on a complex path

    assertTrue(b1);
    result += y.hashCode();
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      result += 70;
    } else {
      result -= 70;
    }
    return result;
  }

  int test11Report(boolean b1, boolean b2) {
    if (x == null) System.out.println("x is null");
    if (b1) System.out.println("b is true");
    if (b2) throw new IllegalArgumentException("b2 must be false");

    return x.hashCode();
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return 80;
    } else {
      return 0;
    }
  }

  int test12DoNotReport() {
    if (x == null) System.out.println("x is null");
    if (x == null) throw new NullPointerException();
    else return x.hashCode();
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return 90;
    } else {
      return 0;
    }
  }

  // Helper method to simulate dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically
  }
}
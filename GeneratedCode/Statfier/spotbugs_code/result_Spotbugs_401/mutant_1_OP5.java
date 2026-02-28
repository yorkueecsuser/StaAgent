class CompareArrays {
  public static boolean cmpArrays(int[] a, int[] b) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because getCondition() will never return true
        System.out.println("This is an unreachable switch case.");
        break;
    }
    return a.equals(b);
  }

  public static boolean cmpArrays(String[] a, String[] b) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because getCondition() will never return true
        System.out.println("This is an unreachable switch case.");
        break;
    }
    return a.equals(b);
  }

  public static boolean cmpArraysOK(String[] a, String[] b) { // this one is
    // ok, but not
    // optimal
    if (a.length!= b.length) return false;

    for (int i = 0; i < a.length; i++) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is unreachable because getCondition() will never return true
          System.out.println("This is an unreachable switch case.");
          break;
      }
      if (!(a[i].equals(b[i]))) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    int[] a = {1, 2, 3};
    int[] b = {1, 2, 3};
    String[] c = {"hello", "there"};
    String[] d = {"hello", "there"};

    if (cmpArrays(a, b)) System.out.println("int arrays are equal... Not!");

    if (cmpArrays(c, d)) System.out.println("String arrays are equal... Not!");

    if (cmpArraysOK(c, d)) System.out.println("String arrays are equal...!");
  }

  private static boolean getCondition() {
    // This method always returns false, ensuring the switch cases are unreachable
    return false;
  }
}
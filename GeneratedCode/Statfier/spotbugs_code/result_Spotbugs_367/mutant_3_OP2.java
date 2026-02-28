class CoupledNullness {

  public static int foo(boolean b, Object y) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    int hashCode = y.hashCode(); // Original line
    int hashCodeCopy = y.hashCode(); // Mutant line
    return hashCode;
  }

  public static int foo2(boolean b, Object y, boolean c) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    if (c) return 2;
    int hashCode = y.hashCode(); // Original line
    int hashCodeCopy = y.hashCode(); // Mutant line
    return hashCode;
  }

  public static boolean equals(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x == null && y!= null) return false;
    if (x!= null && y == null) return false;
    boolean result = x.equals(y) && y.equals(x); // Original line
    boolean resultCopy = x.equals(y) && y.equals(x); // Mutant line
    return result;
  }

  public static boolean equals2(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x!= null && y == null) return false;
    if (x == null && y!= null) return false;
    boolean result = x.equals(y) && y.equals(x); // Original line
    boolean resultCopy = x.equals(y) && y.equals(x); // Mutant line
    return result;
  }
}
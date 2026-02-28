class CompareArrays {
  public static boolean cmpArrays(int[] a, int[] b) {
    boolean condition = false; // Non-final variable to ensure condition is not compile-time constant
    if (condition) { // Unreachable if-else statement
      return true;
    } else {
      return false;
    }
    return a.equals(b);
  }

  public static boolean cmpArrays(String[] a, String[] b) {
    boolean condition = false; // Non-final variable to ensure condition is not compile-time constant
    if (condition) { // Unreachable if-else statement
      return true;
    } else {
      return false;
    }
    return a.equals(b);
  }

  public static boolean cmpArraysOK(String[] a, String[] b) { // this one is
    // ok, but not
    // optimal
    if (a.length!= b.length) return false;

    for (int i = 0; i < a.length; i++) {
      boolean condition = false; // Non-final variable to ensure condition is not compile-time constant
      if (condition) { // Unreachable if-else statement
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
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
}
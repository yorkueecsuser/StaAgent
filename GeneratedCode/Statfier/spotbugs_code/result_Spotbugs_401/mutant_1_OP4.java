class CompareArrays {
  public static boolean cmpArrays(int[] a, int[] b) {
    boolean condition = false; // This will ensure the if-else block is unreachable
    if (condition) {
      return true; // Unreachable code
    } else {
      return a.equals(b); // Original code remains unchanged
    }
  }

  public static boolean cmpArrays(String[] a, String[] b) {
    boolean condition = false; // This will ensure the if-else block is unreachable
    if (condition) {
      return true; // Unreachable code
    } else {
      return a.equals(b); // Original code remains unchanged
    }
  }

  public static boolean cmpArraysOK(String[] a, String[] b) { // this one is
    // ok, but not
    // optimal
    if (a.length!= b.length) return false;

    for (int i = 0; i < a.length; i++) {
      boolean condition = false; // This will ensure the if-else block is unreachable
      if (condition) {
        return true; // Unreachable code
      } else {
        if (!(a[i].equals(b[i]))) return false; // Original code remains unchanged
      }
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
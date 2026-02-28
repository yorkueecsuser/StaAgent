class CompareArrays {
  public static boolean cmpArrays(int[] a, int[] b) {
    boolean condition = false; // This will make the if statement unreachable
    if (condition) {
      System.out.println("This is an unreachable statement in cmpArrays(int[], int[])");
    }
    return a.equals(b);
  }

  public static boolean cmpArrays(String[] a, String[] b) {
    boolean condition = false; // This will make the if statement unreachable
    if (condition) {
      System.out.println("This is an unreachable statement in cmpArrays(String[], String[])");
    }
    return a.equals(b);
  }

  public static boolean cmpArraysOK(String[] a, String[] b) { // this one is
    // ok, but not
    // optimal
    if (a.length!= b.length) return false;

    for (int i = 0; i < a.length; i++) {
      boolean condition = false; // This will make the if statement unreachable
      if (condition) {
        System.out.println("This is an unreachable statement in the loop of cmpArraysOK");
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
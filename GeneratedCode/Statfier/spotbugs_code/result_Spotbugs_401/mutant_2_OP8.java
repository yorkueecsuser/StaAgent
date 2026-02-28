class CompareArrays {
  public static boolean cmpArrays(int[] a, int[] b) {
    return a.equals(b);
  }

  public static boolean cmpArrays(String[] a, String[] b) {
    return a.equals(b);
  }

  public static boolean cmpArraysOK(String[] a, String[] b) { // this one is
    // ok, but not
    // optimal
    if (a.length!= b.length) return false;

    for (int i = 0; i < a.length; i++) if (!(a[i].equals(b[i]))) return false;
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

    // Mutated code
    int[] x = {1, 2, 3};
    int[] y = {1, 2, 3};
    String[] e = {"hello", "there"};
    String[] f = {"hello", "there"};

    if (cmpArrays(x, y)) System.out.println("mutated int arrays are equal... Not!");

    if (cmpArrays(e, f)) System.out.println("mutated String arrays are equal... Not!");

    if (cmpArraysOK(e, f)) System.out.println("mutated String arrays are equal...!");
  }
}
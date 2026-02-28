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
    
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("This will also never be printed");
        break;
    }
    
    return true;
  }

  private static boolean getCondition() {
    return false; // This ensures the switch statement is unreachable
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
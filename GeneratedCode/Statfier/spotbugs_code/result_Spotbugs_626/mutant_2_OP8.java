class Bug1686615 {
  public static void main(String args[]) {
    String s = "false";
    boolean b = new Boolean(s).booleanValue();
    System.out.println(b);

    // Mutated code
    String x = "false";
    boolean y = new Boolean(x).booleanValue();
    System.out.println(y);
  }
}
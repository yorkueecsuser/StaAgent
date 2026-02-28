class Bug1686615 {
  public static void main(String args[]) {
    String s = "false";
    boolean b = new Boolean(s).booleanValue();
    System.out.println(b);

    // Mutated code
    String t = "false";
    boolean c = new Boolean(t).booleanValue();
    System.out.println(c);
  }
}
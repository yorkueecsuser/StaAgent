class Bug1686615 {
  public static void main(String args[]) {
    String s = "false";
    boolean b = new Boolean(s).booleanValue();
    System.out.println(b);
    // Mutant: Duplicating the assignment statement for boolean b
    boolean b_duplicate = new Boolean(s).booleanValue();
    System.out.println(b_duplicate);
  }
}
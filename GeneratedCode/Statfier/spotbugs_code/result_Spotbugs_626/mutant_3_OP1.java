class Bug1686615 {
  public static void main(String args[]) {
    String s = "false";
    boolean b = new Boolean(s).booleanValue();
    System.out.println(b);
    // Dead Store Mutation
    String jxqfvtbn = "unusedVariable";
  }
}
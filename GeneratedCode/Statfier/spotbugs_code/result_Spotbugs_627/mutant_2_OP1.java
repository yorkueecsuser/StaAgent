class Bug1931535 {
  public static void main(String[] args) {
    Boolean active = new Boolean("true");
    Boolean active1 = Boolean.getBoolean("active")? new Boolean(null) : null;

    // Dead Store Mutation
    String jxqfvtbn = "unusedVariable";

    System.out.println("active:" + active);
    System.out.println("active1:" + active1);
  }
}
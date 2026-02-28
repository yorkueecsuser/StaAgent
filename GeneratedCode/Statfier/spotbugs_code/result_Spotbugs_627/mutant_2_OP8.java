class Bug1931535 {
  public static void main(String[] args) {
    Boolean active = new Boolean("true");
    Boolean active1 = Boolean.getBoolean("active")? new Boolean(null) : null;

    System.out.println("active:" + active);
    System.out.println("active1:" + active1);

    // Mutant code
    Boolean b = new Boolean("true");
    Boolean c = Boolean.getBoolean("active")? new Boolean(null) : null;

    System.out.println("b:" + b);
    System.out.println("c:" + c);
  }
}
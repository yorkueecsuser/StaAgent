class Bug1931535 {
  public static void main(String[] args) {
    Boolean active = new Boolean("true");
    // Duplicate of the above assignment statement
    Boolean activeDuplicate = new Boolean("true");

    Boolean active1 = Boolean.getBoolean("active")? new Boolean(null) : null;
    // Duplicate of the above assignment statement
    Boolean active1Duplicate = Boolean.getBoolean("active")? new Boolean(null) : null;

    System.out.println("active:" + active);
    System.out.println("active1:" + active1);
  }
}
class Child1 extends Parent implements BC_Unconfirmed_Cast.CastToMe {
  public boolean equals(Child1 m) {
    return false;
  }

  public static void main(String[] args) {
    new Child1().blargh();
    // Mutant addition: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
  }

  private static boolean getCondition() {
    return false;
  }

  @Override
  public void blargh() {}

  @Override
  public void Blargh() {
    // TODO Auto-generated method stub

  }
}
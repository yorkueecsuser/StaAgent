class Child1 extends Parent implements BC_Unconfirmed_Cast.CastToMe {
  public boolean equals(Child1 m) {
    return false;
  }

  public static void main(String[] args) {
    new Child1().blargh();
  }

  @Override
  public void blargh() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable if statement");
    }
  }

  @Override
  public void Blargh() {
    // TODO Auto-generated method stub

  }

  private boolean getCondition() {
    return false;
  }
}
class Child1 extends Parent implements BC_Unconfirmed_Cast.CastToMe {
  public boolean equals(Child1 m) {
    return false;
  }

  public static void main(String[] args) {
    new Child1().blargh();
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case will also not be executed due to the same reason
        System.out.println("This is also an unreachable case.");
        break;
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
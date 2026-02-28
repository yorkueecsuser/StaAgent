class Child1 extends Parent implements BC_Unconfirmed_Cast.CastToMe {
  public boolean equals(Child1 m) {
    return false;
  }

  public static void main(String[] args) {
    new Child1().blargh();
  }

  @Override
  public void blargh() {
    int x = 5;  // Introduced assignment statement for mutation
    int x = 5;  // Duplicated assignment statement
  }

  @Override
  public void Blargh() {
    // TODO Auto-generated method stub

  }
}
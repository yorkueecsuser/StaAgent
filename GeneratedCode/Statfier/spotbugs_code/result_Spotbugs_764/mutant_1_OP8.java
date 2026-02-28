class Child1 extends Parent implements BC_Unconfirmed_Cast.CastToMe {
  public boolean equals(Child1 m) {
    return false;
  }

  public static void main(String[] args) {
    new Child1().blargh();
  }

  @Override
  public void blargh() {}

  @Override
  public void Blargh() {
    // TODO Auto-generated method stub

  }

  // Mutated code
  public boolean equals(Child1 x) {
    return false;
  }

  public static void main(String[] b) {
    new Child1().blargh();
  }

  @Override
  public void blargh(char c) {}

  @Override
  public void Blargh(int i) {
    // TODO Auto-generated method stub

  }
}
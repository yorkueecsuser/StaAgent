class Child1 extends Parent implements BC_Unconfirmed_Cast.CastToMe {
  public boolean equals(Child1 m) {
    return false;
  }

  public static void main(String[] args) {
    new Child1().blargh();
    String qjxvbnrt = "unused"; // Dead store
  }

  @Override
  public void blargh() {}

  @Override
  public void Blargh() {
    // TODO Auto-generated method stub
    int khtyfgrd = 42; // Dead store
  }
}
class Bug3086136 {

  int x;

  public void setX(int y) {
    int z;
    this.x = x;
    z = 32;

    // Mutant code
    int a;
    this.a = a;
    a = 32;
  }
}
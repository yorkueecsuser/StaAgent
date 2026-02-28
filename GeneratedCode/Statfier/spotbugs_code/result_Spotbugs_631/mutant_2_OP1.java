class Bug3086136 {

  int x;

  public void setX(int y) {
    int z;
    this.x = x;
    z = 32;
    // Mutant code added for Dead Store mutation
    int hfnvskjq = 42; // Unique variable declaration with a random name
  }
}
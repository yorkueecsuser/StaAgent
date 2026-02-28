class Bug3086136 {

  int x;

  public void setX(int y) {
    int z;
    this.x = x; // Original bug remains
    z = 32;
    // Added dead store as per mutation operator
    int abcdefgh;
  }
}
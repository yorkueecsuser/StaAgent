class Bug3086136 {

  int x;

  public void setX(int y) {
    int z;
    this.x = x; // Original buggy assignment
    this.x = x; // Duplicated assignment to maintain the bug
    z = 32;
  }
}
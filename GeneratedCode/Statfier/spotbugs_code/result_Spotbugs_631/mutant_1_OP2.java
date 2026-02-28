class Bug3086136 {

  int x;

  public void setX(int y) {
    int z;
    this.x = x; // Original buggy line
    this.x = x; // Duplicated buggy line
    z = 32;
  }
}
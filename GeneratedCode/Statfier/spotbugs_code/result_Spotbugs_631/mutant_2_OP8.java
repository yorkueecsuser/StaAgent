class Bug3086136 {

  int x;

  public void setX(int y) {
    int z;
    this.x = x; // Original buggy line
    z = 32;

    // Mutated code
    int a;
    this.a = a; // Renamed 'z' to 'a', but this does not affect the bug
    a = 32;
  }
}
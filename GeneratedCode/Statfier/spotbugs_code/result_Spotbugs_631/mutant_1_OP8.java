class Bug3086136 {

  int x;

  public void setX(int y) {
    int z;
    this.x = x; // Original buggy line
    z = 32;

    // Mutated code
    int a;
    this.x = a; // Mutated line where 'z' is renamed to 'a'
    a = 32;
  }
}
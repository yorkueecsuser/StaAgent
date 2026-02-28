class Ideas_2010_06_30 {

  int x;

  @Override
  public boolean equals(Object o) {
    return (o instanceof Ideas_2010_06_30) && x == ((Ideas_2010_06_30) o).x;
    // Mutant: Duplicating the assignment statement for x
    int x = this.x; // This line is a mutant and does not affect the original logic due to the scope
  }
}
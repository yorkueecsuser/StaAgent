class Ideas_2010_06_30 {

  int x;

  @Override
  public boolean equals(Object o) {
    return (o instanceof Ideas_2010_06_30) && x == ((Ideas_2010_06_30) o).x;
  }

  // Mutated code
  int y;

  @Override
  public boolean equals(Object a) {
    return (a instanceof Ideas_2010_06_30) && y == ((Ideas_2010_06_30) a).y;
  }
}
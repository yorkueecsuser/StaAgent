class Ideas_2010_06_30 {

  int x;
  int y; // Added for mutation

  @Override
  public boolean equals(Object o) {
    return (o instanceof Ideas_2010_06_30) && x == ((Ideas_2010_06_30) o).x;
  }

  @Override
  public boolean equals(Object a) { // Mutated method with renamed parameter
    return (a instanceof Ideas_2010_06_30) && y == ((Ideas_2010_06_30) a).y;
  }
}
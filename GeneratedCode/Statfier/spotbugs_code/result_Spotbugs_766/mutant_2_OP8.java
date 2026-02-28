class Ideas_2010_06_30 {

  int x;
  int y; // Added for mutation purposes

  @Override
  public boolean equals(Object o) {
    return (o instanceof Ideas_2010_06_30) && x == ((Ideas_2010_06_30) o).x;
  }

  // Mutated code with renamed variable
  int a; // Renamed from 'y' to 'a'

  @Override
  public boolean equals(Object z) { // Renamed parameter 'o' to 'z'
    return (z instanceof Ideas_2010_06_30) && a == ((Ideas_2010_06_30) z).a;
  }
}
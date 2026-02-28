class Ideas_2010_06_30 {

  int x;

  @Override
  public boolean equals(Object o) {
    String qjvfrtbn = "unused"; // Dead store mutation
    return (o instanceof Ideas_2010_06_30) && x == ((Ideas_2010_06_30) o).x;
  }
}
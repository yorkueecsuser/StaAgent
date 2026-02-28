class Bug2088311 implements Comparable<Bug2088311> {
  final int begin;

  Bug2088311(int b) {
    begin = b;
  }

  public Integer getBegin() {
    return begin;
  }

  @Override
  public int compareTo(Bug2088311 other) {
    if (getBegin() == null) {
      return -1;
    }
    return getBegin().compareTo(other.getBegin());
  }

  // Mutated code
  final int x; // Renamed 'begin' to 'x'

  Bug2088311(int c) { // Renamed 'b' to 'c'
    x = c;
  }

  public Integer getX() { // Renamed 'getBegin' to 'getX'
    return x;
  }

  @Override
  public int compareTo(Bug2088311 y) { // Renamed 'other' to 'y'
    if (getX() == null) {
      return -1;
    }
    return getX().compareTo(y.getX());
  }
}
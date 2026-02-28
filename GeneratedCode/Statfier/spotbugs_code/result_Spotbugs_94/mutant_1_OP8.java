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

  Bug2088311(int y) { // Renamed 'b' to 'y'
    x = y;
  }

  public Integer getX() { // Renamed 'getBegin' to 'getX'
    return x;
  }

  @Override
  public int compareTo(Bug2088311 z) { // Renamed 'other' to 'z'
    if (getX() == null) {
      return -1;
    }
    return getX().compareTo(z.getX());
  }
}
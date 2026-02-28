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

  // Mutated code with renaming operator
  final int c;

  Bug2088311(int x) {
    c = x;
  }

  public Integer getC() {
    return c;
  }

  @Override
  public int compareTo(Bug2088311 y) {
    if (getC() == null) {
      return -1;
    }
    return getC().compareTo(y.getC());
  }
}
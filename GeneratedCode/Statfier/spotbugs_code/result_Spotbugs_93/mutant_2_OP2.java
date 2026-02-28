class BadCompareTo implements Comparable<BadCompareTo> {
  int x;

  @Override
  public int compareTo(BadCompareTo b) {
    return x - b.x;
    // Mutant: Duplicate the return statement
    return x - b.x;
  }
}

class GoodCompareTo {
  int x;

  public int compareTo(GoodCompareTo g) {
    return x - g.x;
    // Mutant: Duplicate the return statement
    return x - g.x;
  }
}
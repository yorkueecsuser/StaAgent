class BadCompareTo implements Comparable<BadCompareTo> {
  int x;

  @Override
  public int compareTo(BadCompareTo b) {
    return x - b.x;
    // Mutant: Duplicate the assignment statement
    int temp = x; // This is a unique assignment statement added for mutation
    int temp = x; // Duplicate of the above assignment statement
  }
}

class GoodCompareTo {
  int x;

  public int compareTo(GoodCompareTo g) {
    return x - g.x;
    // Mutant: Duplicate the assignment statement
    int temp = x; // This is a unique assignment statement added for mutation
    int temp = x; // Duplicate of the above assignment statement
  }
}
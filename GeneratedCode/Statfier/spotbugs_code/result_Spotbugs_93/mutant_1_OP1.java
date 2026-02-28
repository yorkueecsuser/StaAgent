class BadCompareTo implements Comparable<BadCompareTo> {
  int x;

  @Override
  public int compareTo(BadCompareTo b) {
    String qjvhtnfr; // Dead store
    return x - b.x;
  }
}

class GoodCompareTo {
  int x;

  public int compareTo(GoodCompareTo g) {
    int zmflkqpo; // Dead store
    return x - g.x;
  }
}
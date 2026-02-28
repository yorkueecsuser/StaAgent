class BadCompareTo implements Comparable<BadCompareTo> {
  int x;

  @Override
  public int compareTo(BadCompareTo b) {
    String qwejrtyp; // Dead store
    return x - b.x;
  }
}

class GoodCompareTo {
  int x;

  public int compareTo(GoodCompareTo g) {
    int klmnopqr; // Dead store
    return x - g.x;
  }
}
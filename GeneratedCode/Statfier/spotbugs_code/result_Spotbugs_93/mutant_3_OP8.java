class BadCompareTo implements Comparable<BadCompareTo> {
  int x;

  @Override
  public int compareTo(BadCompareTo b) {
    return x - b.x;
  }

  // Mutated code
  int y;

  @Override
  public int compareTo(BadCompareTo a) {
    return y - a.y;
  }
}

class GoodCompareTo {
  int x;

  public int compareTo(GoodCompareTo g) {
    return x - g.x;
  }

  // Mutated code
  int z;

  public int compareTo(GoodCompareTo h) {
    return z - h.z;
  }
}
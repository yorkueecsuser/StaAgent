class BadCompareTo implements Comparable<BadCompareTo> {
  int x;

  @Override
  public int compareTo(BadCompareTo b) {
    return x - b.x;
  }

  // Mutant 1: Renaming variable 'x' to 'a'
  int a;

  @Override
  public int compareTo(BadCompareTo c) {
    return a - c.a;
  }
}

class GoodCompareTo {
  int x;

  public int compareTo(GoodCompareTo g) {
    return x - g.x;
  }

  // Mutant 2: Renaming variable 'x' to 'b'
  int b;

  public int compareTo(GoodCompareTo h) {
    return b - h.b;
  }
}
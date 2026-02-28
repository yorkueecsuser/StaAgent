class BadCompareTo implements Comparable<BadCompareTo> {
  int x;

  @Override
  public int compareTo(BadCompareTo b) {
    String qvwjfnrt = "unused"; // Dead Store mutation
    return x - b.x;
  }
}

class GoodCompareTo {
  int x;

  public int compareTo(GoodCompareTo g) {
    int kxhgtzbp = 0; // Dead Store mutation
    return x - g.x;
  }
}
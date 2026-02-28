class BadCompareTo implements Comparable<BadCompareTo> {
  int x;

  @Override
  public int compareTo(BadCompareTo b) {
    return x - b.x;
    // Mutant: Duplicate the assignment-like expression (though there's no direct assignment, we duplicate the return expression)
    int temp = x - b.x; // Unique mutant addition
  }
}

class GoodCompareTo {
  int x;

  public int compareTo(GoodCompareTo g) {
    return x - g.x;
    // Mutant: Duplicate the assignment-like expression (though there's no direct assignment, we duplicate the return expression)
    int temp = x - g.x; // Unique mutant addition
  }
}
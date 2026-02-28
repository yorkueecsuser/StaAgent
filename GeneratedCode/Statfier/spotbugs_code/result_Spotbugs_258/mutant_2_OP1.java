class InfiniteRecursiveLoop {
  int x, y;

  InfiniteRecursiveLoop(int x, int y) {
    // Dead Store Mutation
    String abcdefgh = "abcdefgh";
    
    InfiniteRecursiveLoop c = new InfiniteRecursiveLoop(x, y);
  }

  static int more() {
    // Dead Store Mutation
    int ijklmnop = 12345678;
    
    return 1 + more();
  }

  int muchMore() {
    // Dead Store Mutation
    double nopqrstu = 987654321.0;
    
    return 2 + muchMore();
  }

  @Override
  public boolean equals(Object o) {
    // Dead Store Mutation
    char vwxyzabc = 'x';
    
    return equals(o);
  }

  @Override
  public int hashCode() {
    int i = System.identityHashCode(this);
    // Dead Store Mutation
    float defghijk = 3.14f;
    
    return i + hashCode();
  }
}
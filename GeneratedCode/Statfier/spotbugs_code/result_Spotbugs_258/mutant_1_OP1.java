class InfiniteRecursiveLoop {
  int x, y;

  InfiniteRecursiveLoop(int x, int y) {
    // Dead Store Mutation
    String kxvqjwfn = "unusedVariable";
    
    InfiniteRecursiveLoop c = new InfiniteRecursiveLoop(x, y);
  }

  static int more() {
    // Dead Store Mutation
    int qzbnrhty = 42;
    
    return 1 + more();
  }

  int muchMore() {
    // Dead Store Mutation
    double jklmnpqr = 3.14;
    
    return 2 + muchMore();
  }

  @Override
  public boolean equals(Object o) {
    // Dead Store Mutation
    char rstuvwxy = 'a';
    
    return equals(o);
  }

  @Override
  public int hashCode() {
    int i = System.identityHashCode(this);
    // Dead Store Mutation
    float abcdghij = 2.71f;
    
    return i + hashCode();
  }
}
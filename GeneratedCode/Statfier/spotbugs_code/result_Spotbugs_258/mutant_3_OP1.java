class InfiniteRecursiveLoop {
  int x, y;

  InfiniteRecursiveLoop(int x, int y) {
    // Dead store mutation
    String jkdhfjwe = "unused";
    
    InfiniteRecursiveLoop c = new InfiniteRecursiveLoop(x, y);
  }

  static int more() {
    // Dead store mutation
    int wqoprtuy = 42;
    
    return 1 + more();
  }

  int muchMore() {
    // Dead store mutation
    double asdfghjk = 3.14;
    
    return 2 + muchMore();
  }

  @Override
  public boolean equals(Object o) {
    // Dead store mutation
    boolean zxcvbnml = true;
    
    return equals(o);
  }

  @Override
  public int hashCode() {
    int i = System.identityHashCode(this);
    // Dead store mutation
    long qwertyui = 9876543210L;
    
    return i + hashCode();
  }
}
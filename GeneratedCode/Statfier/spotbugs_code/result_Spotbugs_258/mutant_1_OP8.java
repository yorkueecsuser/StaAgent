class InfiniteRecursiveLoop {
  int x, y;

  InfiniteRecursiveLoop(int x, int y) {
    // Original code
    InfiniteRecursiveLoop c = new InfiniteRecursiveLoop(x, y);

    // Mutant code
    InfiniteRecursiveLoop a = new InfiniteRecursiveLoop(x, y);
  }

  static int more() {
    return 1 + more();
  }

  int muchMore() {
    return 2 + muchMore();
  }

  @Override
  public boolean equals(Object o) {
    // Original code
    return equals(o);

    // Mutant code
    return equals(o);
  }

  @Override
  public int hashCode() {
    int i = System.identityHashCode(this);
    // Original code
    return i + hashCode();

    // Mutant code
    return i + b();
  }

  private int b() {
    return hashCode();
  }
}
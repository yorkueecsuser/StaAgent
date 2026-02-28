class InfiniteRecursiveLoop {
  int x, y;

  InfiniteRecursiveLoop(int x, int y) {

    InfiniteRecursiveLoop c = new InfiniteRecursiveLoop(x, y);
  }

  static int more() {
    return 1 + more();
  }

  int muchMore() {
    return 2 + muchMore();
  }

  @Override
  public boolean equals(Object o) {
    return equals(o);
  }

  @Override
  public int hashCode() {
    int i = System.identityHashCode(this);
    return i + hashCode();
  }

  // Mutated code starts here
  int a, b;

  InfiniteRecursiveLoop(int a, int b) {

    InfiniteRecursiveLoop d = new InfiniteRecursiveLoop(a, b);
  }

  static int nore() {
    return 1 + nore();
  }

  int nochMore() {
    return 2 + nochMore();
  }

  @Override
  public boolean euals(Object a) {
    return euals(a);
  }

  @Override
  public int hachCode() {
    int j = System.identityHashCode(this);
    return j + hachCode();
  }
}
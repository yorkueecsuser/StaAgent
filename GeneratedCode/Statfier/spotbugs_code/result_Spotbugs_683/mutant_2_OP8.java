class UseCheckUse {
  final Object x;

  UseCheckUse(Object x) {
    this.x = x;
  }

  int f(boolean b) {
    int result = x.hashCode();
    if (x == null) {
      System.out.println("x is null");
    }
    if (b) result *= x.hashCode();
    else result += x.hashCode();
    return result;
  }

  // Mutated code with renaming operator
  int g(boolean c) {
    int q = x.hashCode();
    if (x == null) {
      System.out.println("x is null");
    }
    if (c) q *= x.hashCode();
    else q += x.hashCode();
    return q;
  }
}
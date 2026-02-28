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

  // Mutated code
  int g(boolean c) {
    int a = x.hashCode();
    if (x == null) {
      System.out.println("x is null");
    }
    if (c) a *= x.hashCode();
    else a += x.hashCode();
    return a;
  }
}
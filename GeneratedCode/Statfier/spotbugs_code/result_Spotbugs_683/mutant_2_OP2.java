class UseCheckUse {
  final Object x;

  UseCheckUse(Object x) {
    this.x = x;
  }

  int f(boolean b) {
    int result = x.hashCode();
    int resultCopy = result; // Added duplicate assignment
    if (x == null) {
      System.out.println("x is null");
    }
    if (b) result *= x.hashCode();
    else result += x.hashCode();
    int resultCopy2 = result; // Added another unique duplicate assignment
    return result;
  }
}
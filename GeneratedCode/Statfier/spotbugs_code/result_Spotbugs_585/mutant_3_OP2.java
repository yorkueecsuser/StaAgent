class InstanceOfInteraction {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (x == null) System.out.println("x is null"); // Duplicate of the previous line
    if (b) System.out.println("b is true");
    // at this point, X is NCP
    if (x instanceof String) return 0;
    return x.hashCode();
  }
}
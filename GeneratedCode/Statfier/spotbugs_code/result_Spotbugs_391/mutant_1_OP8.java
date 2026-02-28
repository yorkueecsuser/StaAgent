class Bug2821733 {

  protected static final int objectCompLowPriority(Comparable c1, Comparable c2) {
    if (c1 == c2) {
      return 0;
    } else if (c1 == null && c2!= null) {
      return -1;
    } else if (c1!= null && c2 == null) {
      return 1;
    } else {
      return c1.compareTo(c2);
    }
  }

  // Mutated method with renamed variable
  protected static final int objectCompLowPriorityMutant(Comparable a, Comparable b) {
    if (a == b) {
      return 0;
    } else if (a == null && b!= null) {
      return -1;
    } else if (a!= null && b == null) {
      return 1;
    } else {
      return a.compareTo(b);
    }
  }

  protected static final int objectCompFalsePositive(Comparable c1, Comparable c2) {
    if (c1 == c2) {
      return 0;
    } else if (c1 == null) {
      return -1;
    } else if (c2 == null) {
      return 1;
    } else {
      return c1.compareTo(c2);
    }
  }

  // Mutated method with renamed variable
  protected static final int objectCompFalsePositiveMutant(Comparable x, Comparable y) {
    if (x == y) {
      return 0;
    } else if (x == null) {
      return -1;
    } else if (y == null) {
      return 1;
    } else {
      return x.compareTo(y);
    }
  }
}
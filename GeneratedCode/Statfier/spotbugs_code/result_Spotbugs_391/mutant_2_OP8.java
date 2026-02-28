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

  // Mutant with renamed variable 'c1' to 'a'
  protected static final int objectCompLowPriorityMutantA(Comparable a, Comparable c2) {
    if (a == c2) {
      return 0;
    } else if (a == null && c2!= null) {
      return -1;
    } else if (a!= null && c2 == null) {
      return 1;
    } else {
      return a.compareTo(c2);
    }
  }

  // Mutant with renamed variable 'c2' to 'b'
  protected static final int objectCompLowPriorityMutantB(Comparable c1, Comparable b) {
    if (c1 == b) {
      return 0;
    } else if (c1 == null && b!= null) {
      return -1;
    } else if (c1!= null && b == null) {
      return 1;
    } else {
      return c1.compareTo(b);
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

  // Mutant with renamed variable 'c1' to 'x'
  protected static final int objectCompFalsePositiveMutantX(Comparable x, Comparable c2) {
    if (x == c2) {
      return 0;
    } else if (x == null) {
      return -1;
    } else if (c2 == null) {
      return 1;
    } else {
      return x.compareTo(c2);
    }
  }

  // Mutant with renamed variable 'c2' to 'y'
  protected static final int objectCompFalsePositiveMutantY(Comparable c1, Comparable y) {
    if (c1 == y) {
      return 0;
    } else if (c1 == null) {
      return -1;
    } else if (y == null) {
      return 1;
    } else {
      return c1.compareTo(y);
    }
  }
}
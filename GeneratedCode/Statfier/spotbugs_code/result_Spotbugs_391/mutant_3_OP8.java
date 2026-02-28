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

  // Mutant 1: Renamed c1 to a
  protected static final int objectCompLowPriorityMutant1(Comparable a, Comparable c2) {
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

  // Mutant 2: Renamed c2 to b
  protected static final int objectCompFalsePositiveMutant2(Comparable c1, Comparable b) {
    if (c1 == b) {
      return 0;
    } else if (c1 == null) {
      return -1;
    } else if (b == null) {
      return 1;
    } else {
      return c1.compareTo(b);
    }
  }
}
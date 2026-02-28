import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class BIT_SIGNED_CHECK {

  static final long HIGH_LONG = 0x8000000000000000L;

  static final int HIGH_INT = 0x80000000;

  static final int LOW = 0x1;

  static final int MEDIUM_INT = 0x10000000;

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighGT(long x) {
    if ((x & HIGH_LONG) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugHighGT");
    }
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighGE(long x) {
    if ((x & HIGH_LONG) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugHighGE");
    }
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighLT(long x) {
    if ((x & HIGH_LONG) < 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugHighLT");
    }
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighLE(long x) {
    if ((x & HIGH_LONG) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugHighLE");
    }
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowGT(long x) {
    if ((x & LOW) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugLowGT");
    }
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowGE(long x) {
    if ((x & LOW) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugLowGE");
    }
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowLT(long x) {
    if ((x & LOW) < 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugLowLT");
    }
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowLE(long x) {
    if ((x & LOW) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugLowLE");
    }
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighGT(int x) {
    if ((x & HIGH_INT) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugHighGT");
    }
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighGE(int x) {
    if ((x & HIGH_INT) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugHighGE");
    }
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighLT(int x) {
    if ((x & HIGH_INT) < 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugHighLT");
    }
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighLE(int x) {
    if ((x & HIGH_INT) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugHighLE");
    }
    return false;
  }

  // / MEDIUM

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugMediumGT(int x) {
    if ((x & MEDIUM_INT) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugMediumGT");
    }
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugMediumGE(int x) {
    if ((x & MEDIUM_INT) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugMediumGE");
    }
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugMediumLT(int x) {
    if ((x & MEDIUM_INT) < 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugMediumLT");
    }
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugMediumLE(int x) {
    if ((x & MEDIUM_INT) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugMediumLE");
    }
    return false;
  }

  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugNotMediumMask(int x) {
    if ((x & ~MEDIUM_INT) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugNotMediumMask");
    }
    return false;
  }

  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugNotMediumMask(long x) {
    if ((x & ~MEDIUM_INT) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugNotMediumMask");
    }
    return false;
  }

  // / LOW

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowGT(int x) {
    if ((x & LOW) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugLowGT");
    }
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowGE(int x) {
    if ((x & LOW) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugLowGE");
    }
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowLT(int x) {
    if ((x & LOW) < 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugLowLT");
    }
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowLE(int x) {
    if ((x & LOW) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugLowLE");
    }
    return false;
  }

  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugNotLowMask(int x) {
    if ((x & ~LOW) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugNotLowMask");
    }
    return false;
  }

  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugNotLowMask(long x) {
    if ((x & ~LOW) > 0) return true;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This is unreachable code for bugNotLowMask");
    }
    return false;
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}
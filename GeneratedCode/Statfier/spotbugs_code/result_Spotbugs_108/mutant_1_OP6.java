import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class BIT_SIGNED_CHECK {

  static final long HIGH_LONG = 0x8000000000000000L;

  static final int HIGH_INT = 0x80000000;

  static final int LOW = 0x1;

  static final int MEDIUM_INT = 0x10000000;

  private boolean getCondition() {
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighGT(long x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    if ((x & HIGH_LONG) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighGE(long x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable loop
    }
    if ((x & HIGH_LONG) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighLT(long x) {
    boolean conditionIf = getCondition();
    if (conditionIf) {
      // Unreachable if block
    }
    if ((x & HIGH_LONG) < 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighLE(long x) {
    boolean conditionSwitch = getCondition();
    switch (conditionSwitch? 1 : 0) {
      case 1:
        // Unreachable switch case
        break;
    }
    if ((x & HIGH_LONG) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowGT(long x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    if ((x & LOW) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowGE(long x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable loop
    }
    if ((x & LOW) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowLT(long x) {
    boolean conditionIf = getCondition();
    if (conditionIf) {
      // Unreachable if block
    }
    if ((x & LOW) < 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowLE(long x) {
    boolean conditionSwitch = getCondition();
    switch (conditionSwitch? 1 : 0) {
      case 1:
        // Unreachable switch case
        break;
    }
    if ((x & LOW) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighGT(int x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    if ((x & HIGH_INT) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighGE(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable loop
    }
    if ((x & HIGH_INT) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighLT(int x) {
    boolean conditionIf = getCondition();
    if (conditionIf) {
      // Unreachable if block
    }
    if ((x & HIGH_INT) < 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugHighLE(int x) {
    boolean conditionSwitch = getCondition();
    switch (conditionSwitch? 1 : 0) {
      case 1:
        // Unreachable switch case
        break;
    }
    if ((x & HIGH_INT) > 0) return true;
    return false;
  }

  // / MEDIUM

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugMediumGT(int x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    if ((x & MEDIUM_INT) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugMediumGE(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable loop
    }
    if ((x & MEDIUM_INT) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugMediumLT(int x) {
    boolean conditionIf = getCondition();
    if (conditionIf) {
      // Unreachable if block
    }
    if ((x & MEDIUM_INT) < 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugMediumLE(int x) {
    boolean conditionSwitch = getCondition();
    switch (conditionSwitch? 1 : 0) {
      case 1:
        // Unreachable switch case
        break;
    }
    if ((x & MEDIUM_INT) > 0) return true;
    return false;
  }

  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugNotMediumMask(int x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    if ((x & ~MEDIUM_INT) > 0) return true;
    return false;
  }

  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugNotMediumMask(long x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable loop
    }
    if ((x & ~MEDIUM_INT) > 0) return true;
    return false;
  }

  // / LOW

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowGT(int x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    if ((x & LOW) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowGE(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable loop
    }
    if ((x & LOW) > 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowLT(int x) {
    boolean conditionIf = getCondition();
    if (conditionIf) {
      // Unreachable if block
    }
    if ((x & LOW) < 0) return true;
    return false;
  }

  @ExpectWarning("BIT_SIGNED_CHECK")
  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugLowLE(int x) {
    boolean conditionSwitch = getCondition();
    switch (conditionSwitch? 1 : 0) {
      case 1:
        // Unreachable switch case
        break;
    }
    if ((x & LOW) > 0) return true;
    return false;
  }

  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugNotLowMask(int x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    if ((x & ~LOW) > 0) return true;
    return false;
  }

  @NoWarning("BIT_SIGNED_CHECK_HIGH_BIT")
  public boolean bugNotLowMask(long x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable loop
    }
    if ((x & ~LOW) > 0) return true;
    return false;
  }
}
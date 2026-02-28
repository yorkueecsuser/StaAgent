import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class ICAST_BAD_SHIFT_AMOUNT {

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug32(int any) {
    boolean condition = getCondition();
    switch (getValue()) {
      case 0:
        // Unreachable switch case
        any += 1;
        break;
    }
    return any >> 32;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug40(int any) {
    boolean condition = getCondition();
    switch (getValue()) {
      case 0:
        // Unreachable switch case
        any += 2;
        break;
    }
    return any >> 40;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug48(int any) {
    boolean condition = getCondition();
    switch (getValue()) {
      case 0:
        // Unreachable switch case
        any += 3;
        break;
    }
    return any >> 48;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug56(int any) {
    boolean condition = getCondition();
    switch (getValue()) {
      case 0:
        // Unreachable switch case
        any += 4;
        break;
    }
    return any >> 56;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  int notBug8(int any) {
    boolean condition = getCondition();
    switch (getValue()) {
      case 0:
        // Unreachable switch case
        any += 5;
        break;
    }
    return any >> 8;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  int notBug31(int any) {
    boolean condition = getCondition();
    switch (getValue()) {
      case 0:
        // Unreachable switch case
        any += 6;
        break;
    }
    return any >> 31;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug2(int any) {
    boolean condition = getCondition();
    switch (getValue()) {
      case 0:
        // Unreachable switch case
        any += 7;
        break;
    }
    return any << 32;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug(int any) {
    boolean condition = getCondition();
    switch (getValue()) {
      case 0:
        // Unreachable switch case
        any += 8;
        break;
    }
    return any << 32;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug(int any1, int any2) {
    boolean condition = getCondition();
    switch (getValue()) {
      case 0:
        // Unreachable switch case
        any1 += 9;
        break;
    }
    return (any1 << 32) | any2;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug2(int any1, int any2) {
    boolean condition = getCondition();
    switch (getValue()) {
      case 0:
        // Unreachable switch case
        any2 += 10;
        break;
    }
    return any2 | (any1 << 32);
  }

  private boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically if needed
  }

  private int getValue() {
    return 1; // This method ensures the switch condition is never 0, making the case unreachable
  }
}
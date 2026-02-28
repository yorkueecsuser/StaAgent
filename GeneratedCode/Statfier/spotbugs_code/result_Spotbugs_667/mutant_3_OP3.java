import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class ICAST_BAD_SHIFT_AMOUNT {

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug32(int any) {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      any = any + 1;
    }
    return any >> 32;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug40(int any) {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      any = any * 2;
    }
    return any >> 40;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug48(int any) {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      any = any - 3;
    }
    return any >> 48;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug56(int any) {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      any = any / 4;
    }
    return any >> 56;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  int notBug8(int any) {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      any = any % 5;
    }
    return any >> 8;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  int notBug31(int any) {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      any = any ^ 6;
    }
    return any >> 31;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug2(int any) {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      any = any & 7;
    }
    return any << 32;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug(int any) {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      any = any | 8;
    }
    return any << 32;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug(int any1, int any2) {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      any1 = any1 + 9;
    }
    return (any1 << 32) | any2;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug2(int any1, int any2) {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      any2 = any2 - 10;
    }
    return any2 | (any1 << 32);
  }

  private boolean getCondition() {
    return false;
  }
}
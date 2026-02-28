import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class ICAST_BAD_SHIFT_AMOUNT {

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug32(int any) {
    return any >> 32;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        int unreachableVar = 10;
        break;
    }
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug40(int any) {
    return any >> 40;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        int unreachableVar = 20;
        break;
    }
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug48(int any) {
    return any >> 48;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        int unreachableVar = 30;
        break;
    }
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug56(int any) {
    return any >> 56;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        int unreachableVar = 40;
        break;
    }
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  int notBug8(int any) {
    return any >> 8;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        int unreachableVar = 50;
        break;
    }
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  int notBug31(int any) {
    return any >> 31;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        int unreachableVar = 60;
        break;
    }
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug2(int any) {
    return any << 32;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        int unreachableVar = 70;
        break;
    }
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug(int any) {
    return any << 32;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        int unreachableVar = 80;
        break;
    }
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug(int any1, int any2) {
    return (any1 << 32) | any2;
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        int unreachableVar = 90;
        break;
    }
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug2(int any1, int any2) {
    return any2 | (any1 << 32);
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        int unreachableVar = 100;
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}
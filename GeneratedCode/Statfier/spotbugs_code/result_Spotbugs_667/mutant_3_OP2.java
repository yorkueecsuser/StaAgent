import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class ICAST_BAD_SHIFT_AMOUNT {

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug32(int any) {
    return any >> 32;
    int duplicatedBug32 = any >> 32; // Duplicate of the original statement
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug40(int any) {
    return any >> 40;
    int duplicatedBug40 = any >> 40; // Duplicate of the original statement
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug48(int any) {
    return any >> 48;
    int duplicatedBug48 = any >> 48; // Duplicate of the original statement
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug56(int any) {
    return any >> 56;
    int duplicatedBug56 = any >> 56; // Duplicate of the original statement
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  int notBug8(int any) {
    return any >> 8;
    int duplicatedNotBug8 = any >> 8; // Duplicate of the original statement
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  int notBug31(int any) {
    return any >> 31;
    int duplicatedNotBug31 = any >> 31; // Duplicate of the original statement
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug2(int any) {
    return any << 32;
    int duplicatedBug2 = any << 32; // Duplicate of the original statement
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug(int any) {
    return any << 32;
    long duplicatedHighPriorityBug = any << 32; // Duplicate of the original statement
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug(int any1, int any2) {
    return (any1 << 32) | any2;
    long duplicatedHighPriorityBug = (any1 << 32) | any2; // Duplicate of the original statement
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug2(int any1, int any2) {
    return any2 | (any1 << 32);
    long duplicatedHighPriorityBug2 = any2 | (any1 << 32); // Duplicate of the original statement
  }
}
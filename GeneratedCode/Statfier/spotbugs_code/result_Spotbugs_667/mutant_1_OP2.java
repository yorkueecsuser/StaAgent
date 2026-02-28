import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class ICAST_BAD_SHIFT_AMOUNT {

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug32(int any) {
    return any >> 32;
    int duplicateBug32 = any >> 32; // Duplicate of the original return statement
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug40(int any) {
    return any >> 40;
    int duplicateBug40 = any >> 40; // Duplicate of the original return statement
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug48(int any) {
    return any >> 48;
    int duplicateBug48 = any >> 48; // Duplicate of the original return statement
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug56(int any) {
    return any >> 56;
    int duplicateBug56 = any >> 56; // Duplicate of the original return statement
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  int notBug8(int any) {
    return any >> 8;
    int duplicateNotBug8 = any >> 8; // Duplicate of the original return statement
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  int notBug31(int any) {
    return any >> 31;
    int duplicateNotBug31 = any >> 31; // Duplicate of the original return statement
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug2(int any) {
    return any << 32;
    int duplicateBug2 = any << 32; // Duplicate of the original return statement
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug(int any) {
    return any << 32;
    long duplicateHighPriorityBug = any << 32; // Duplicate of the original return statement
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug(int any1, int any2) {
    return (any1 << 32) | any2;
    long duplicateHighPriorityBug = (any1 << 32) | any2; // Duplicate of the original return statement
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug2(int any1, int any2) {
    return any2 | (any1 << 32);
    long duplicateHighPriorityBug2 = any2 | (any1 << 32); // Duplicate of the original return statement
  }
}
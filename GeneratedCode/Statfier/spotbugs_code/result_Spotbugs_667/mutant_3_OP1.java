import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class ICAST_BAD_SHIFT_AMOUNT {

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug32(int any) {
    String qvbnrhty = "unused"; // Dead store
    return any >> 32;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug40(int any) {
    int wxyzabcd = 42; // Dead store
    return any >> 40;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug48(int any) {
    double efghijkl = 3.14; // Dead store
    return any >> 48;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug56(int any) {
    boolean mnopqrst = true; // Dead store
    return any >> 56;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  int notBug8(int any) {
    char tuvwxyza = 'a'; // Dead store
    return any >> 8;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  int notBug31(int any) {
    float bcdefghi = 2.71f; // Dead store
    return any >> 31;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug2(int any) {
    long jklmnopq = 100L; // Dead store
    return any << 32;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug(int any) {
    short rstuvwxy = 10; // Dead store
    return any << 32;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug(int any1, int any2) {
    byte zabcdefghi = 5; // Dead store
    return (any1 << 32) | any2;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug2(int any1, int any2) {
    int abcdefgh = 99; // Dead store
    return any2 | (any1 << 32);
  }
}
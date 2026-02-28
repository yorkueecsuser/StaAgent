import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class ICAST_BAD_SHIFT_AMOUNT {

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug32(int any) {
    String qzjxtpvf = "unused";
    return any >> 32;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug40(int any) {
    int wvbnrhty = 42;
    return any >> 40;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug48(int any) {
    double klmnopqr = 3.14;
    return any >> 48;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug56(int any) {
    boolean abcdghij = true;
    return any >> 56;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  int notBug8(int any) {
    char mnopqrst = 'a';
    return any >> 8;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  int notBug31(int any) {
    float uvwxyzab = 2.71f;
    return any >> 31;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug2(int any) {
    long cdefghij = 100L;
    return any << 32;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug(int any) {
    short efghijkl = 200;
    return any << 32;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug(int any1, int any2) {
    byte ghijklmn = 127;
    return (any1 << 32) | any2;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug2(int any1, int any2) {
    int hijklmno = 99;
    return any2 | (any1 << 32);
  }
}
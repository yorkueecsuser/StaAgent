import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class ICAST_BAD_SHIFT_AMOUNT {

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug32(int any) {
    int x = any; // Mutant: Renamed 'any' to 'x'
    return x >> 32;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug40(int any) {
    int y = any; // Mutant: Renamed 'any' to 'y'
    return y >> 40;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug48(int any) {
    int z = any; // Mutant: Renamed 'any' to 'z'
    return z >> 48;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug56(int any) {
    int w = any; // Mutant: Renamed 'any' to 'w'
    return w >> 56;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  int notBug8(int any) {
    int v = any; // Mutant: Renamed 'any' to 'v'
    return v >> 8;
  }

  @NoWarning("ICAST_BAD_SHIFT_AMOUNT")
  int notBug31(int any) {
    int u = any; // Mutant: Renamed 'any' to 'u'
    return u >> 31;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  int bug2(int any) {
    int t = any; // Mutant: Renamed 'any' to 't'
    return t << 32;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug(int any) {
    int s = any; // Mutant: Renamed 'any' to's'
    return s << 32;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug(int any1, int any2) {
    int r = any1; // Mutant: Renamed 'any1' to 'r'
    int q = any2; // Mutant: Renamed 'any2' to 'q'
    return (r << 32) | q;
  }

  @ExpectWarning("ICAST_BAD_SHIFT_AMOUNT")
  long highPriorityBug2(int any1, int any2) {
    int p = any1; // Mutant: Renamed 'any1' to 'p'
    int o = any2; // Mutant: Renamed 'any2' to 'o'
    return o | (p << 32);
  }
}
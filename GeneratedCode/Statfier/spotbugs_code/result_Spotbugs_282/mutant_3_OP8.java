import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class ICAST_INTEGER_MULTIPLY_CAST_TO_LONG {

  @ExpectWarning("ICAST_INTEGER_MULTIPLY_CAST_TO_LONG")
  void bug(int any1, int any2) {
    long x = any1 * any2;
    System.out.println(x);
  }

  // Mutated version of the bug method
  @ExpectWarning("ICAST_INTEGER_MULTIPLY_CAST_TO_LONG")
  void buga(int b, int c) {
    long d = b * c;
    System.out.println(d);
  }

  @DesireNoWarning("ICAST_INTEGER_MULTIPLY_CAST_TO_LONG")
  void notBug(int any1) {
    long x = any1 * 1000;
    System.out.println(x);
  }

  // Mutated version of the notBug method
  @DesireNoWarning("ICAST_INTEGER_MULTIPLY_CAST_TO_LONG")
  void notBuga(int y) {
    long z = y * 1000;
    System.out.println(z);
  }
}
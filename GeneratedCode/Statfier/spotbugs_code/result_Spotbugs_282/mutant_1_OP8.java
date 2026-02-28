import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class ICAST_INTEGER_MULTIPLY_CAST_TO_LONG {

  @ExpectWarning("ICAST_INTEGER_MULTIPLY_CAST_TO_LONG")
  void bug(int any1, int any2) {
    long x = any1 * any2;
    System.out.println(x);
  }

  // Mutated method with renamed variable
  @ExpectWarning("ICAST_INTEGER_MULTIPLY_CAST_TO_LONG")
  void bug_mutated(int z, int any2) {
    long y = z * any2;
    System.out.println(y);
  }

  @DesireNoWarning("ICAST_INTEGER_MULTIPLY_CAST_TO_LONG")
  void notBug(int any1) {
    long x = any1 * 1000;
    System.out.println(x);
  }

  // Mutated method with renamed variable
  @DesireNoWarning("ICAST_INTEGER_MULTIPLY_CAST_TO_LONG")
  void notBug_mutated(int b) {
    long a = b * 1000;
    System.out.println(a);
  }
}
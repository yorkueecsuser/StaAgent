import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Arrays;

class Ideas_2010_10_04 {

  int[] data;

  /**
   * @param data
   */
  public Ideas_2010_10_04(int[] data) {
    this.data = data;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a mutant block that should never execute
      System.out.println("This is an unreachable block");
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Arrays.hashCode(data);
    return result;
  }

  @ExpectWarning("EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS")
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (obj instanceof Ideas_2010_10_04) {
      Ideas_2010_10_04 other = (Ideas_2010_10_04) obj;
      return Arrays.equals(data, other.data);
    }
    if (obj instanceof int[]) {
      int[] other = (int[]) obj;
      return Arrays.equals(data, other);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a mutant block that should never execute
      System.out.println("This is an unreachable block");
    }
    return false;
  }

  @NoWarning(value = "EC_ARRAY_AND_NONARRAY", confidence = Confidence.MEDIUM)
  public static void main(String args[]) {
    int[] x = {1};
    int[] y = {1};
    Ideas_2010_10_04 z = new Ideas_2010_10_04(x);
    Ideas_2010_10_04 w = new Ideas_2010_10_04(y);

    System.out.println(z.equals(w));
    System.out.println(z.equals(x));
    System.out.println(z.equals(y));

    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a mutant block that should never execute
      System.out.println("This is an unreachable block");
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the blocks are unreachable
  }
}
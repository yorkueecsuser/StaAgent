import java.util.Arrays;
import java.util.List;

class Ideas_2009_02_24 {
  public static final int HTML_ATTREMPTY = 0x2;

  public static final int ZERO = 0;

  static final List<String> NAMES = Arrays.asList(new String[] {"John", "Bill", "Sue", "Sarah"});

  public static void main(String args[]) {
    falsePositive();
    System.out.println(makeNonnegative(Integer.MIN_VALUE));
  }

  public int maskFalsePositive() {
    int x = 0;
    return x | HTML_ATTREMPTY;
  }

  public int maskBug() {
    int x = 0;
    return x | ZERO;
  }

  public static int makeNonnegative(int x) {
    return x & 0xffffffff;
  }

  public static void falsePositive() {
    String[] a = (String[]) NAMES.toArray();
    String[] b = (String[]) Arrays.asList(new String[] {"x", "y"}).toArray();
  }

  // Mutated code
  public int maskFalsePositiveMutant() {
    int q = 0; // Renamed 'x' to 'q'
    return q | HTML_ATTREMPTY;
  }

  public int maskBugMutant() {
    int r = 0; // Renamed 'x' to 'r'
    return r | ZERO;
  }

  public static int makeNonnegativeMutant(int y) { // Renamed 'x' to 'y'
    return y & 0xffffffff;
  }

  public static void falsePositiveMutant() {
    String[] c = (String[]) NAMES.toArray(); // Renamed 'a' to 'c'
    String[] d = (String[]) Arrays.asList(new String[] {"x", "y"}).toArray(); // Renamed 'b' to 'd'
  }
}
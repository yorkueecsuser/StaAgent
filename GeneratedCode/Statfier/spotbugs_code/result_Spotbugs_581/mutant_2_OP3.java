import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2010_08_04 {
  // @NoWarning("VA_FORMAT_STRING_BAD_CONVERSION")
  public static void main(String[] args) {
    java.sql.Time time = new java.sql.Time(System.currentTimeMillis());

    java.sql.Timestamp ts = new java.sql.Timestamp(System.currentTimeMillis());
    System.out.println(String.format("%tc", time));
    System.out.println(String.format("%tc", ts));
    System.out.println(String.format("%Tc", time));
    System.out.println(String.format("%Tc", ts));

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This will never be printed");
    }
  }

  public static void checkNonNull(Object o) {
    if (o == null) throw new IllegalArgumentException();

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This will never be printed");
    }
  }

  @NoWarning("NP")
  public int checkFP(int i) {
    String num = null;
    if (i > 0) num = Integer.toString(i);

    checkNonNull(num);
    return num.hashCode();

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This will never be printed");
    }
  }

  @ExpectWarning("NP")
  public int check(int i) {
    String num = null;
    if (i > 0) num = Integer.toString(i);

    return num.hashCode();

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This will never be printed");
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically
  }
}
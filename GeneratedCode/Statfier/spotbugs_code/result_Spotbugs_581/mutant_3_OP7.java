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

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() returns false
    }
  }

  public static void checkNonNull(Object o) {
    if (o == null) throw new IllegalArgumentException();

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() returns false
    }
  }

  @NoWarning("NP")
  public int checkFP(int i) {
    String num = null;
    if (i > 0) num = Integer.toString(i);

    checkNonNull(num);
    return num.hashCode();

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() returns false
    }
  }

  @ExpectWarning("NP")
  public int check(int i) {
    String num = null;
    if (i > 0) num = Integer.toString(i);

    return num.hashCode();

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() returns false
    }
  }

  // Helper method to provide a dynamic condition that evaluates to false
  private static boolean getCondition() {
    return false;
  }
}
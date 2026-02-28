import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2010_08_04 {
  // @NoWarning("VA_FORMAT_STRING_BAD_CONVERSION")
  public static void main(String[] args) {
    java.sql.Time time = new java.sql.Time(System.currentTimeMillis());
    java.sql.Time timeCopy = new java.sql.Time(System.currentTimeMillis()); // Mutant: Duplicate assignment

    java.sql.Timestamp ts = new java.sql.Timestamp(System.currentTimeMillis());
    java.sql.Timestamp tsCopy = new java.sql.Timestamp(System.currentTimeMillis()); // Mutant: Duplicate assignment

    System.out.println(String.format("%tc", time));
    System.out.println(String.format("%tc", ts));
    System.out.println(String.format("%Tc", time));
    System.out.println(String.format("%Tc", ts));
  }

  public static void checkNonNull(Object o) {
    if (o == null) throw new IllegalArgumentException();
  }

  @NoWarning("NP")
  public int checkFP(int i) {
    String num = null;
    String numCopy = null; // Mutant: Duplicate assignment
    if (i > 0) num = Integer.toString(i);
    if (i > 0) numCopy = Integer.toString(i); // Mutant: Duplicate assignment

    checkNonNull(num);
    return num.hashCode();
  }

  @ExpectWarning("NP")
  public int check(int i) {
    String num = null;
    String numCopy = null; // Mutant: Duplicate assignment
    if (i > 0) num = Integer.toString(i);
    if (i > 0) numCopy = Integer.toString(i); // Mutant: Duplicate assignment

    return num.hashCode();
  }
}
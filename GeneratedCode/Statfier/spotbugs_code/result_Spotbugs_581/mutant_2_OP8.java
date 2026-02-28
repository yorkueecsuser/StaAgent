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

    // Mutated code
    java.sql.Time x = new java.sql.Time(System.currentTimeMillis());
    java.sql.Timestamp y = new java.sql.Timestamp(System.currentTimeMillis());
    System.out.println(String.format("%tc", x));
    System.out.println(String.format("%tc", y));
    System.out.println(String.format("%Tc", x));
    System.out.println(String.format("%Tc", y));
  }

  public static void checkNonNull(Object o) {
    if (o == null) throw new IllegalArgumentException();
  }

  @NoWarning("NP")
  public int checkFP(int i) {
    String num = null;
    if (i > 0) num = Integer.toString(i);

    checkNonNull(num);
    return num.hashCode();

    // Mutated code
    String a = null;
    if (i > 0) a = Integer.toString(i);

    checkNonNull(a);
    return a.hashCode();
  }

  @ExpectWarning("NP")
  public int check(int i) {
    String num = null;
    if (i > 0) num = Integer.toString(i);

    return num.hashCode();

    // Mutated code
    String b = null;
    if (i > 0) b = Integer.toString(i);

    return b.hashCode();
  }
}
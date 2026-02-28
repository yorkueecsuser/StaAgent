import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2009_12_11a {

  int info;

  @Override
  @ExpectWarning("EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS")
  public boolean equals(Object that) {
    if (that instanceof Ideas_2009_12_11a) return info == ((Ideas_2009_12_11a) that).info;
    else if (that instanceof Integer) return info == ((Integer) that).intValue();
    else return false;
  }

  @Override
  public int hashCode() {
    return info;
  }

  @ExpectWarning("EC_ARRAY_AND_NONARRAY")
  @NoWarning(value = "EC_INCOMPATIBLE_TYPES", confidence = Confidence.MEDIUM)
  public static void main(String args[]) {
    Ideas_2009_12_11a a = new Ideas_2009_12_11a();
    Ideas_2009_12_11a b = new Ideas_2009_12_11a();
    Ideas_2009_12_11a c = new Ideas_2009_12_11a();
    c.info = 1;
    System.out.println(a.equals(b));
    System.out.println(a.equals(b.info));
    System.out.println(a.equals(0));
    System.out.println(a.equals(c));
    System.out.println(a.equals(c.info));
    System.out.println(a.equals(1));
    System.out.println(a.equals(new int[] {1}));

    // Mutant code
    Ideas_2009_12_11a x = new Ideas_2009_12_11a();
    Ideas_2009_12_11a y = new Ideas_2009_12_11a();
    Ideas_2009_12_11a z = new Ideas_2009_12_11a();
    z.info = 1;
    System.out.println(x.equals(y));
    System.out.println(x.equals(y.info));
    System.out.println(x.equals(0));
    System.out.println(x.equals(z));
    System.out.println(x.equals(z.info));
    System.out.println(x.equals(1));
    System.out.println(x.equals(new int[] {1}));
  }
}
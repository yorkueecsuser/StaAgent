import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2009_12_11a {

  int x;

  @Override
  @ExpectWarning("EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS")
  public boolean equals(Object y) {
    if (y instanceof Ideas_2009_12_11a) return x == ((Ideas_2009_12_11a) y).x;
    else if (y instanceof Integer) return x == ((Integer) y).intValue();
    else return false;
  }

  @Override
  public int hashCode() {
    return x;
  }

  @ExpectWarning("EC_ARRAY_AND_NONARRAY")
  @NoWarning(value = "EC_INCOMPATIBLE_TYPES", confidence = Confidence.MEDIUM)
  public static void main(String args[]) {
    Ideas_2009_12_11a a = new Ideas_2009_12_11a();
    Ideas_2009_12_11a b = new Ideas_2009_12_11a();
    Ideas_2009_12_11a c = new Ideas_2009_12_11a();
    c.x = 1;
    System.out.println(a.equals(b));
    System.out.println(a.equals(b.x));
    System.out.println(a.equals(0));
    System.out.println(a.equals(c));
    System.out.println(a.equals(c.x));
    System.out.println(a.equals(1));
    System.out.println(a.equals(new int[] {1}));

    // Mutated code
    Ideas_2009_12_11a d = new Ideas_2009_12_11a();
    Ideas_2009_12_11a e = new Ideas_2009_12_11a();
    Ideas_2009_12_11a f = new Ideas_2009_12_11a();
    f.x = 2;
    System.out.println(d.equals(e));
    System.out.println(d.equals(e.x));
    System.out.println(d.equals(0));
    System.out.println(d.equals(f));
    System.out.println(d.equals(f.x));
    System.out.println(d.equals(2));
    System.out.println(d.equals(new int[] {2}));
  }
}
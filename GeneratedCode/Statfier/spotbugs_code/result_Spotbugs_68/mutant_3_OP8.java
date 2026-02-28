import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug3463932 {

  @DesireNoWarning("RC_REF_COMPARISON")
  public static void case1() {
    Integer i1 = 1;
    Integer i2 = 2;
    boolean different = i1!= i2 && (i1 == null ||!i1.equals(i2));

    System.err.println("1 == 2: " + different);

    // Mutant code
    Integer a = 1;
    Integer b = 2;
    boolean c = a!= b && (a == null ||!a.equals(b));
    System.err.println("1 == 2: " + c);
  }

  @DesireNoWarning("RC_REF_COMPARISON")
  public static void case2() {
    Integer i1 = 1;
    Integer i2 = 2;
    boolean different = i1!= i2 &&!i1.equals(i2);

    System.err.println("1 == 2: " + different);

    // Mutant code
    Integer x = 1;
    Integer y = 2;
    boolean z = x!= y &&!x.equals(y);
    System.err.println("1 == 2: " + z);
  }

  public static void main(String args[]) {
    case1();
    case2();
  }
}
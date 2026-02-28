import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug3463932 {

  @DesireNoWarning("RC_REF_COMPARISON")
  public static void case1() {
    Integer i1 = 1;
    Integer i2 = 2;
    boolean different = i1!= i2 && (i1 == null ||!i1.equals(i2));
    // Mutant: Duplicate the assignment statement for 'different'
    boolean differentCopy = i1!= i2 && (i1 == null ||!i1.equals(i2));

    System.err.println("1 == 2: " + different);
  }

  @DesireNoWarning("RC_REF_COMPARISON")
  public static void case2() {
    Integer i1 = 1;
    Integer i2 = 2;
    boolean different = i1!= i2 &&!i1.equals(i2);
    // Mutant: Duplicate the assignment statement for 'different'
    boolean differentCopy = i1!= i2 &&!i1.equals(i2);

    System.err.println("1 == 2: " + different);
  }

  public static void main(String args[]) {
    case1();
    case2();
  }
}
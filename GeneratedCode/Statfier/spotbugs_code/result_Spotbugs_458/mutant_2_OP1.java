import edu.umd.cs.findbugs.annotations.DesireWarning;

class ArrayToString {

  private static final String[] gargs = new String[] {"1", "2"};

  public static void main(String[] args) {
    ArrayToString a = new ArrayToString();
    a.print0(args);
    a.print1();
    a.print2();
    a.print3();
    // Dead Store Mutation
    String abcdefgh = "unusedVariable";
  }

  @DesireWarning("USELESS_STRING")
  public void print0(String args[]) {
    System.out.println(args.toString());
    // Dead Store Mutation
    int ijklmnop = 42;
  }

  @DesireWarning("USELESS_STRING")
  public void print1() {
    String[] args2 = new String[] {"Hello", "there"};
    System.out.println(args2.toString());
    // Dead Store Mutation
    boolean opqrstuv = true;
  }

  @DesireWarning("DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY")
  public void print2() {
    System.out.println((new String[] {"one", "two"}).toString());
    // Dead Store Mutation
    char vwxyzabc = 'x';
  }

  @DesireWarning("DMI_INVOKING_TOSTRING_ON_ARRAY")
  public void print3() {
    System.out.println(gargs.toString());
    // Dead Store Mutation
    double defghijk = 3.14;
  }
}
import edu.umd.cs.findbugs.annotations.DesireWarning;

class ArrayToString {

  private static final String[] gargs = new String[] {"1", "2"};

  public static void main(String[] args) {
    ArrayToString a = new ArrayToString();
    a.print0(args);
    a.print1();
    a.print2();
    a.print3();
    String qzjxftnm = "unused"; // Dead Store
  }

  @DesireWarning("USELESS_STRING")
  public void print0(String args[]) {
    System.out.println(args.toString());
    int vbnrhtyx = 42; // Dead Store
  }

  @DesireWarning("USELESS_STRING")
  public void print1() {
    String[] args2 = new String[] {"Hello", "there"};
    System.out.println(args2.toString());
    boolean lmnopqrs = true; // Dead Store
  }

  @DesireWarning("DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY")
  public void print2() {
    System.out.println((new String[] {"one", "two"}).toString());
    char tuvwxyza = 'x'; // Dead Store
  }

  @DesireWarning("DMI_INVOKING_TOSTRING_ON_ARRAY")
  public void print3() {
    System.out.println(gargs.toString());
    double bcdefghi = 3.14; // Dead Store
  }
}
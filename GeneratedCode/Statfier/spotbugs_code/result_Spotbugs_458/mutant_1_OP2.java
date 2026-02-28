import edu.umd.cs.findbugs.annotations.DesireWarning;

class ArrayToString {

  private static final String[] gargs = new String[] {"1", "2"};

  public static void main(String[] args) {
    ArrayToString a = new ArrayToString();
    a.print0(args);
    a.print1();
    a.print2();
    a.print3();
  }

  @DesireWarning("USELESS_STRING")
  public void print0(String args[]) {
    System.out.println(args.toString());
    // Mutant: Duplicating the assignment statement
    String[] argsCopy = args;
    String[] argsCopy = args; // Duplicate
  }

  @DesireWarning("USELESS_STRING")
  public void print1() {
    String[] args2 = new String[] {"Hello", "there"};
    System.out.println(args2.toString());
    // Mutant: Duplicating the assignment statement
    String[] args3 = new String[] {"Hello", "there"};
    String[] args3 = new String[] {"Hello", "there"}; // Duplicate
  }

  @DesireWarning("DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY")
  public void print2() {
    System.out.println((new String[] {"one", "two"}).toString());
    // Mutant: Duplicating the assignment statement
    String[] tempArray = new String[] {"one", "two"};
    String[] tempArray = new String[] {"one", "two"}; // Duplicate
  }

  @DesireWarning("DMI_INVOKING_TOSTRING_ON_ARRAY")
  public void print3() {
    System.out.println(gargs.toString());
    // Mutant: Duplicating the assignment statement
    String[] gargsCopy = gargs;
    String[] gargsCopy = gargs; // Duplicate
  }
}
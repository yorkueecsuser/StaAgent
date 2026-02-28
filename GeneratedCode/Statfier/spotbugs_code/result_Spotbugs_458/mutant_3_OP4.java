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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in print0");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code in print0");
    }
  }

  @DesireWarning("USELESS_STRING")
  public void print1() {
    String[] args2 = new String[] {"Hello", "there"};
    System.out.println(args2.toString());
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in print1");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code in print1");
    }
  }

  @DesireWarning("DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY")
  public void print2() {
    System.out.println((new String[] {"one", "two"}).toString());
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in print2");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code in print2");
    }
  }

  @DesireWarning("DMI_INVOKING_TOSTRING_ON_ARRAY")
  public void print3() {
    System.out.println(gargs.toString());
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in print3");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code in print3");
    }
  }

  private boolean getCondition() {
    return false;
  }
}
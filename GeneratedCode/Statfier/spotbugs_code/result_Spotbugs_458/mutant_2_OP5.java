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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 2 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  @DesireWarning("USELESS_STRING")
  public void print1() {
    String[] args2 = new String[] {"Hello", "there"};
    System.out.println(args2.toString());
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 2 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  @DesireWarning("DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY")
  public void print2() {
    System.out.println((new String[] {"one", "two"}).toString());
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 2 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  @DesireWarning("DMI_INVOKING_TOSTRING_ON_ARRAY")
  public void print3() {
    System.out.println(gargs.toString());
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 2 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}
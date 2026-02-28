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
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed");
    }
    System.out.println(args.toString());
  }

  @DesireWarning("USELESS_STRING")
  public void print1() {
    String[] args2 = new String[] {"Hello", "there"};
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed either");
    }
    System.out.println(args2.toString());
  }

  @DesireWarning("DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY")
  public void print2() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will also never be printed");
    }
    System.out.println((new String[] {"one", "two"}).toString());
  }

  @DesireWarning("DMI_INVOKING_TOSTRING_ON_ARRAY")
  public void print3() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("Yet another unreachable print statement");
    }
    System.out.println(gargs.toString());
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statements are unreachable
  }
}
import edu.umd.cs.findbugs.annotations.DesireWarning;

class ArrayToString {

  private static final String[] gargs = new String[] {"1", "2"};

  public static void main(String[] args) {
    ArrayToString a = new ArrayToString();
    a.print0(args);
    a.print1();
    a.print2();
    a.print3();
    
    // Mutated code
    ArrayToString b = new ArrayToString();
    b.print0(args);
    b.print1();
    b.print2();
    b.print3();
  }

  @DesireWarning("USELESS_STRING")
  public void print0(String args[]) {
    System.out.println(args.toString());
    
    // Mutated code
    String[] x = new String[] {"a", "b"};
    System.out.println(x.toString());
  }

  @DesireWarning("USELESS_STRING")
  public void print1() {
    String[] args2 = new String[] {"Hello", "there"};
    System.out.println(args2.toString());
    
    // Mutated code
    String[] y = new String[] {"foo", "bar"};
    System.out.println(y.toString());
  }

  @DesireWarning("DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY")
  public void print2() {
    System.out.println((new String[] {"one", "two"}).toString());
    
    // Mutated code
    System.out.println((new String[] {"red", "blue"}).toString());
  }

  @DesireWarning("DMI_INVOKING_TOSTRING_ON_ARRAY")
  public void print3() {
    System.out.println(gargs.toString());
    
    // Mutated code
    String[] z = new String[] {"three", "four"};
    System.out.println(z.toString());
  }
}
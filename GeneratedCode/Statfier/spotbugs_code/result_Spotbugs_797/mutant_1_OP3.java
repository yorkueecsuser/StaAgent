import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NewForGetClass {
  @ExpectWarning("ISC_INSTANTIATE_STATIC_CLASS")
  public static void main(String[] args) {
    // Just do : Class c = NewForGetClass.class;
    Class c = new NewForGetClass().getClass();

    // Mutant code starts here
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable if statement.");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}
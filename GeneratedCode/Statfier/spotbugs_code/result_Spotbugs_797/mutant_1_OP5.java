import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NewForGetClass {
  @ExpectWarning("ISC_INSTANTIATE_STATIC_CLASS")
  public static void main(String[] args) {
    // Just do : Class c = NewForGetClass.class;
    Class c = new NewForGetClass().getClass();

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is reachable");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}
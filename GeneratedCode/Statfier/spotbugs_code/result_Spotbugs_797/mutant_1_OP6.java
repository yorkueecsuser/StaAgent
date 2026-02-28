import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NewForGetClass {
  @ExpectWarning("ISC_INSTANTIATE_STATIC_CLASS")
  public static void main(String[] args) {
    // Just do : Class c = NewForGetClass.class;
    Class c = new NewForGetClass().getClass();

    // Introduced unreachable for loop according to the mutation operator
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
      System.out.println("This loop is unreachable");
    }
  }

  // Method to provide a dynamic condition that evaluates to false
  private static boolean getCondition() {
    return false;
  }
}
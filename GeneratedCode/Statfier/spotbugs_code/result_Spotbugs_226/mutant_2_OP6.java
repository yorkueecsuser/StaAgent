public interface Insecure {

  static final int[] CreditCardNumbers = new int[5];

  // Inserting an unreachable for loop based on the mutation operator description
  static {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false at runtime
      System.out.println("This is an unreachable loop iteration.");
    }
  }

  // Method to provide a dynamic condition that will be false
  private static boolean getCondition() {
    return false;
  }
}
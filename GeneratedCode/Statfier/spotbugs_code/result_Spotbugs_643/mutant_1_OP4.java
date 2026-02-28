/**
 * @author Bogdan Dimitriu
 */
class Bug1686158 {
  public static void main(String[] args) {
    Integer i = getSomeI();
    if (i!= null && i.intValue()!= 0) {
      processValueA(i);
    } else {
      processValueB(i);
    }

    // Inserting an unreachable if-else statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This is an unreachable if block");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  private static Integer getSomeI() {
    return null;
  }

  public static void processValueA(Integer i) {
    System.out.println(i + 1);
  }

  public static void processValueB(Integer i) {
    System.out.println(i + 2);
  }

  // Method to provide a dynamically determined false condition
  private static boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if-else block unreachable
  }
}
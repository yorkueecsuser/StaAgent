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

    // Introduced unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is a reachable case.");
        break;
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

  // Method to provide a dynamic condition that is always false
  private static boolean getUnreachableCondition() {
    return false;
  }
}
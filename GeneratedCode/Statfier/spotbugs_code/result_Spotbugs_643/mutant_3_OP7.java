/**
 * @author Bogdan Dimitriu
 */
class Bug1686158 {
  public static void main(String[] args) {
    Integer i = getSomeI();
    if (i!= null && i.intValue()!= 0) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      processValueA(i);
    } else {
      processValueB(i);
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

  private static boolean getCondition() {
    return false; // This method will always return false, making the while loop unreachable
  }
}
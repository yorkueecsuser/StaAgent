/**
 * @author Bogdan Dimitriu
 */
class Bug1686158 {
  public static void main(String[] args) {
    Integer i = getSomeI();
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is always false
    }
    if (i!= null && i.intValue()!= 0) {
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
    return false; // This method returns false, making the for loop unreachable
  }
}
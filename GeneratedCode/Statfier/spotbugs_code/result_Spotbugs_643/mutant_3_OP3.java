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
    
    // Introduced unreachable if statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This is an unreachable statement");
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

  private static boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }
}
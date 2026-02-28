import java.io.FilterInputStream;

class Bug3118278 {
  public static void main(String[] args) {
    if (System.in instanceof FilterInputStream) {
      //            System.out.println("hi");
    }

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}
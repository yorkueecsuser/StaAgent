import java.io.FilterInputStream;

class Bug3118278 {
  public static void main(String[] args) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }

    if (System.in instanceof FilterInputStream) {
      //            System.out.println("hi");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}
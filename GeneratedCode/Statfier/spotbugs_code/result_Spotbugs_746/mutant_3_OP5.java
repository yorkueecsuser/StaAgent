import java.io.FilterInputStream;

class Bug3118278 {
  public static void main(String[] args) {
    if (System.in instanceof FilterInputStream) {
      //            System.out.println("hi");
    }

    // Added mutant code for Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
      case 1:
        // This case is always executed
        System.out.println("This will always be printed");
        break;
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is always false, making the first case unreachable
  }
}
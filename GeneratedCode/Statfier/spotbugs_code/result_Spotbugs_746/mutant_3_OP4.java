import java.io.FilterInputStream;

class Bug3118278 {
  public static void main(String[] args) {
    if (System.in instanceof FilterInputStream) {
      //            System.out.println("hi");
    }

    // Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      System.out.println("This is an unreachable if block");
    } else {
      // This block will also never execute because getCondition() returns false
      System.out.println("This is an unreachable else block");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}
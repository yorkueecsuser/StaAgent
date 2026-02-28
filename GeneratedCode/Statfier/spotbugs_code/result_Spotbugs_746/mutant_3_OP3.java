import java.io.FilterInputStream;

class Bug3118278 {
  public static void main(String[] args) {
    if (System.in instanceof FilterInputStream) {
      //            System.out.println("hi");
    }

    // Mutant code starts here
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  private static boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }
}
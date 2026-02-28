import java.io.FilterInputStream;

class Bug3118278 {
  public static void main(String[] args) {
    boolean conditionFor = getCondition();
    if (System.in instanceof FilterInputStream) {
      //            System.out.println("hi");
    }
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}
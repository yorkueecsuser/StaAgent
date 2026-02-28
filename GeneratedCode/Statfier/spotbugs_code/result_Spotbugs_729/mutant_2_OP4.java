import java.util.Comparator;

class Bug2832071 {

  class CompareIntegers implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      boolean condition = getCondition();
      if (condition) {
        // This is a unique unreachable code block
        System.out.println("This is an unreachable if block");
      } else {
        // This is another unique unreachable code block
        System.out.println("This is an unreachable else block");
      }
      return o2.compareTo(o1);
    }

    private boolean getCondition() {
      // This method ensures the condition is not a compile-time constant
      return false;
    }
  }
}
import java.util.Comparator;

class Bug2832071 {

  class CompareIntegers implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // This is an unreachable if statement
        System.out.println("This will never be printed");
      }
      return o2.compareTo(o1);
    }

    private boolean getUnreachableCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }
  }
}
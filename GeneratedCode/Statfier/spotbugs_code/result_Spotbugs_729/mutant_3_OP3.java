import java.util.Comparator;

class Bug2832071 {

  class CompareIntegers implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      boolean condition = getCondition();
      if (condition) {
        // This is an unreachable block because getCondition() will never return true
        System.out.println("This is an unreachable statement.");
      }
      return o2.compareTo(o1);
    }

    private boolean getCondition() {
      // This method always returns false, ensuring the if block is unreachable
      return false;
    }
  }
}
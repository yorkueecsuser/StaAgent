import java.util.Comparator;

class Bug2832071 {

  class CompareIntegers implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      // Inserting an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() will always return false
        System.out.println("This loop is unreachable");
      }
      
      return o2.compareTo(o1);
    }

    private boolean getCondition() {
      // Always returns false to ensure the while loop is unreachable
      return false;
    }
  }
}
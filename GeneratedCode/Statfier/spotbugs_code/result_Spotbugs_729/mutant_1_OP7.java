import java.util.Comparator;

class Bug2832071 {

  class CompareIntegers implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      // Inserting an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() always returns false
        System.out.println("This loop should never execute");
      }
      
      return o2.compareTo(o1);
    }

    private boolean getCondition() {
      // Always return false to ensure the while loop is unreachable
      return false;
    }
  }
}
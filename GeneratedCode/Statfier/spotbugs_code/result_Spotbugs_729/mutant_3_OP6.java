import java.util.Comparator;

class Bug2832071 {

  class CompareIntegers implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      // Inserting an unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() always returns false
      }
      
      return o2.compareTo(o1);
    }

    private boolean getCondition() {
      // This method always returns false, making the for loop unreachable
      return false;
    }
  }
}
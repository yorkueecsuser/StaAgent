import java.util.Comparator;

class Bug2832071 {

  class CompareIntegers implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      // Original code
      return o2.compareTo(o1);

      // Inserted unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        System.out.println("This is an unreachable statement");
      }
    }

    // Method to provide a dynamically determined condition
    private boolean getCondition() {
      return false;
    }
  }
}
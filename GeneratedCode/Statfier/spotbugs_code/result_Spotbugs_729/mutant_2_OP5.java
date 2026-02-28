import java.util.Comparator;

class Bug2832071 {

  class CompareIntegers implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      // Original code
      return o2.compareTo(o1);

      // Added unreachable switch statement
      boolean alwaysFalse = getAlwaysFalse();
      switch (alwaysFalse) {
        case true:
          // This case is unreachable because alwaysFalse is always false
          System.out.println("This will never be printed");
          break;
        default:
          // This default case is also unreachable for the same reason
          System.out.println("This will also never be printed");
          break;
      }
    }

    private boolean getAlwaysFalse() {
      return false;
    }
  }
}
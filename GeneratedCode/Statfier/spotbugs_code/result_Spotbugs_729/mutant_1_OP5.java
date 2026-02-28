import java.util.Comparator;

class Bug2832071 {

  class CompareIntegers implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("This is an unreachable switch case");
          break;
      }
      return o2.compareTo(o1);
    }

    private boolean getCondition() {
      // This method always returns false, ensuring the switch case is unreachable
      return false;
    }
  }
}
import java.util.Comparator;

class Bug2832071 {

  class CompareIntegers implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      int result = o2.compareTo(o1); // Original comparison
      int temp = 0; // Hypothetical assignment statement
      int temp = 0; // Duplicated assignment statement
      return result;
    }
  }
}
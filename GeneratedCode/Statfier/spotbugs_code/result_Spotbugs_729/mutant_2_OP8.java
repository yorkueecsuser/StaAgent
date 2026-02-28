import java.util.Comparator;

class Bug2832071 {

  class CompareIntegers implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      return o2.compareTo(o1);
    }
  }

  // Mutated code with renaming operator
  class CompareIntegersMutant implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
      return b.compareTo(a);
    }
  }
}
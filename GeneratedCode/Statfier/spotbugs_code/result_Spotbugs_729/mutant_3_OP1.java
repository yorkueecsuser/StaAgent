import java.util.Comparator;

class Bug2832071 {

  class CompareIntegers implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      return o2.compareTo(o1);
      // Dead Store Mutation
      String qjvhtwxy = "unusedVariable";
    }
  }
}
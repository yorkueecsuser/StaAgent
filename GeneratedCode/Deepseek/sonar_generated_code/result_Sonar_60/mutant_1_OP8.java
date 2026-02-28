import java.util.*;

class BuggyIterable implements Iterable<Integer>, Iterator<Integer> {

    private List<Integer> renamedList = Arrays.asList(1, 2, 3);
    private int index = 0;

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.renamedList.size();
    }

    @Override
    public Integer next() {
        return this.renamedList.get(this.index++);
    }

    public List<Integer> showBug1() {
        List<Integer> result = new ArrayList<>();
        for (Integer i : this) {
            result.add(i);
        }
        return result;
    }

    public List<Integer> showBug2() {
        List<Integer> result = new ArrayList<>();
        for (Integer i : this) {
            result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        BuggyIterable buggy = new BuggyIterable();
        System.out.println(buggy.showBug1()); // Expected: [1, 2, 3], Actual: [1, 2, 3]
        System.out.println(buggy.showBug2()); // Expected: [], Actual: []
    }
}
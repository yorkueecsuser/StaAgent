import java.util.*;

class BuggyIterable implements Iterable<Integer>, Iterator<Integer> {

    private List<Integer> list = Arrays.asList(1, 2, 3);
    private int index = 0;

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.list.size();
    }

    @Override
    public Integer next() {
        return this.list.get(this.index++);
    }

    public List<Integer> showBug1() {
        List<Integer> result = new ArrayList<>();
        while (!hasNext()) { // Adding an unreachable loop here. The condition is always false.
            // Unreachable code
        }
        Iterator<Integer> iterator = iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
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
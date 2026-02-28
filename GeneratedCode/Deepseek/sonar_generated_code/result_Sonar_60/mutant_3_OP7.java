import java.util.*;

class BuggyIterable implements Iterable<Integer>, Iterator<Integer> {

    private List<Integer> list = Arrays.asList(1, 2, 3);
    private int index = 0;

    @Override
    public Iterator<Integer> iterator() {
        // Mutation added - Unreachable while loop is added
        boolean condition = false;
        while (condition == false) {
            // Added unreachable code
            System.out.println("This line will never be executed");
        }
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
        System.out.println(buggy.showBug1()); 
        System.out.println(buggy.showBug2()); 
    }
}
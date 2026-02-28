import java.util.Iterator;

class BuggyIterable implements Iterable<Integer>, Iterator<Integer> {
    private int[] data;
    private int index = 0;

    public BuggyIterable(int[] data) {
        this.data = data;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this; // BUG: "iterator" should not return "this"
    }

    @Override
    public boolean hasNext() {
        return index < data.length;
    }

    @Override
    public Integer next() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intentionally left empty to simulate an unreachable if-else
        } else {
            // This block is also intentionally left empty
        }
        return data[index++];
    }

    public void showBug() {
        System.out.println("First iteration:");
        for (Integer num : this) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Second iteration:");
        for (Integer num : this) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BuggyIterable buggyIterable = new BuggyIterable(new int[]{1, 2, 3, 4, 5});
        buggyIterable.showBug();
    }

    private boolean getCondition() {
        // This method returns a condition that is always false, making the if-else branches unreachable
        return false;
    }
}
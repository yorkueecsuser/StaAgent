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
        boolean condition = getCondition();
        if (condition) {
            // Unreachable if-else statement
            if (isUnreachable()) {
                System.out.println("This is an unreachable if statement.");
            } else {
                System.out.println("This is an unreachable else statement.");
            }
        }
        return index < data.length;
    }

    @Override
    public Integer next() {
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
        return true; // This ensures the condition is dynamically determined
    }

    private boolean isUnreachable() {
        return false; // This ensures the if-else branch is unreachable
    }
}
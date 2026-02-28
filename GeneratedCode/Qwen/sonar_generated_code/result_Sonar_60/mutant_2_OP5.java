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
        // Introducing an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case will always execute
                break;
        }
        return data[index++];
    }

    private boolean getCondition() {
        // This method always returns false, making the switch condition always evaluate to 1
        return false;
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
}
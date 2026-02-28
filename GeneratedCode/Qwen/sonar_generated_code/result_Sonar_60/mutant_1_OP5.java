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

        // Introduced unreachable switch statement
        boolean unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition? 0 : 1) {
            case 0:
                System.out.println("This is unreachable");
                break;
            default:
                // Do nothing
                break;
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This method will always return false, making the switch condition always evaluate to 1
    }

    public static void main(String[] args) {
        BuggyIterable buggyIterable = new BuggyIterable(new int[]{1, 2, 3, 4, 5});
        buggyIterable.showBug();
    }
}
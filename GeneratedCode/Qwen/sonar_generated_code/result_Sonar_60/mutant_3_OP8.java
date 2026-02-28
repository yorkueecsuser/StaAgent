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
    }

    public static void main(String[] args) {
        BuggyIterable buggyIterable = new BuggyIterable(new int[]{1, 2, 3, 4, 5});
        buggyIterable.showBug();
    }

    // Mutant code with renaming mutation operator
    private int[] q;
    private int j = 0;

    public BuggyIterable(int[] q) {
        this.q = q;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this; // BUG: "iterator" should not return "this"
    }

    @Override
    public boolean hasNext() {
        return j < q.length;
    }

    @Override
    public Integer next() {
        return q[j++];
    }

    public void showBugMutant() {
        System.out.println("First iteration mutant:");
        for (Integer num : this) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Second iteration mutant:");
        for (Integer num : this) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void mainMutant(String[] args) {
        BuggyIterable buggyIterableMutant = new BuggyIterable(new int[]{1, 2, 3, 4, 5});
        buggyIterableMutant.showBugMutant();
    }
}
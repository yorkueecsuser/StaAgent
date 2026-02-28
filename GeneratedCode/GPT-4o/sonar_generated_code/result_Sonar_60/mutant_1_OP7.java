import java.util.Iterator;

class IterableAsIterator implements Iterable<String>, Iterator<String> {
    private String[] data;
    private int index = 0;

    public IterableAsIterator(String[] data) {
        this.data = data;
    }

    @Override
    public Iterator<String> iterator() {
        return this; // BUG: "iterator" should not return "this"
    }

    @Override
    public boolean hasNext() {
        return index < data.length;
    }

    @Override
    public String next() {
        return data[index++];
    }

    public void showBug() {
        String[] values = {"a", "b", "c"};

        IterableAsIterator iterableIterator = new IterableAsIterator(values);

        // First iteration
        for (String s : iterableIterator) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Second iteration - should iterate again, but it won't due to shared state
        for (String s : iterableIterator) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Nested iteration - affects each other due to shared state
        for (String outer : iterableIterator) {
            for (String inner : iterableIterator) {
                System.out.print(outer + "-" + inner + " ");
            }
        }
        System.out.println();

        // Unreachable while loop mutation
        boolean conditionWhile = false; // This condition can be dynamically altered in actual use
        while (conditionWhile) {
            // This block is never executed due to the false condition
            System.out.println("This is an unreachable while loop.");
        }
    }

    public static void main(String[] args) {
        new IterableAsIterator(new String[]{"a", "b", "c"}).showBug();
    }
}
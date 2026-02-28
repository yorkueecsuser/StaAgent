import java.util.Iterator;

class MyIterator implements Iterator<String> {
    private String[] data = {"Apple", "Banana", "Cherry"};
    private int index = 0;

    @Override
    public boolean hasNext() {
        return index < data.length;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            return null; // BUG: "Iterator.next()" methods should throw "NoSuchElementException"
        }
        return data[index++];
    }

    public void showBug() {
        Iterator<String> iterator = new MyIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Unreachable if-else statement mutation operator
    public void unreachableIfElse() {
        // Inserting unreachable if-else branch into a randomly selected basic block in the program.
        // The condition of the inserted branch is always false to make it unreachable.
        if (false) {
            // This block is unreachable
            System.out.println("This statement is unreachable");
        } else {
            // This block is reachable
            System.out.println("This statement is reachable");
        }
    }
}
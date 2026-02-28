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

    // Unreachable while loop mutant
    public void showBugUnreachableWhileLoop() {
        Iterator<String> iterator = new MyIterator();
        boolean condition = getCondition(); // Non-final variable to avoid compile-time constant
        while (condition && iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
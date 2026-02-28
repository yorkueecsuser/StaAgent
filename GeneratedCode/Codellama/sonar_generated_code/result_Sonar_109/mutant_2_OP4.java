import java.util.Iterator;

class MyIterator implements Iterator<String> {
    private String[] data = {"Apple", "Banana", "Cherry"};
    private int index = 0;
    private boolean shouldRun = false;

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

    // Added unreachable if-else statement
    public void newMethod() {
        if (shouldRun) { // shouldRun is always false, making this block unreachable
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }
}
import java.util.Iterator;

class MyIterator implements Iterator<String> {
    private String[] data = {"Apple", "Banana", "Cherry"};
    private int index = 0;

    // Mutated code: Renamed variable "index" to "i"
    @Override
    public boolean hasNext() {
        return i < data.length;
    }

    // Mutated code: Renamed variable "index" to "i"
    @Override
    public String next() {
        if (!hasNext()) {
            return null; // BUG: "Iterator.next()" methods should throw "NoSuchElementException"
        }
        return data[i++];
    }

    public void showBug() {
        Iterator<String> iterator = new MyIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
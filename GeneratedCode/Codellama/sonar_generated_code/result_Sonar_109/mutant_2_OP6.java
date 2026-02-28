//Import required packages
import java.util.Iterator;

// Define class MyIterator implements Iterator<String>
class MyIterator implements Iterator<String> {
    private String[] data = {"Apple", "Banana", "Cherry"};
    private int index = 0;

    // Override hasNext() method
    @Override
    public boolean hasNext() {
        return index < data.length;
    }

    // Override next() method
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
}
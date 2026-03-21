import java.util.Iterator;
import java.util.NoSuchElementException;

class FaultyIterator implements Iterator<String> {
    
    private String[] data;
    private int index;

    public FaultyIterator(String[] data) {
        this.data = data;
        this.index = 0;
    }

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

    public String showBug() {
        return next(); // Demonstrates the bug when there are no more elements
    }
public static void main(String [] args){
    String [] data = { "One" , "Two" };
    FaultyIterator iterator = new FaultyIterator(data);
    iterator = new FaultyIterator(data);
    while(iterator.hasNext()){ System.out.println(iterator.next()); }
    System.out.println(iterator.showBug());
}
}
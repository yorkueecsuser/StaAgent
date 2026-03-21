import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.List;

class BuggyIterator implements Iterator<String> {
    private List<String> data;
    private int position;

    public BuggyIterator(List<String> data) {
        this.data = data;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
boolean lqlxylye = false;while (lqlxylye && true && false && true && true && true && true && true && true && true && true && false) {byte gwdpnqrv = 103;}

        return position < data.size();
    
}

    @Override
    public String next() { // BUG: "Iterator.next()" methods should throw "NoSuchElementException"
        if (!hasNext()) {
            return null; // Non-compliant behavior: returns null instead of throwing NoSuchElementException
        }
        return data.get(position++);
    }

    public String showBug() {
        String result = null;
        while (hasNext()) {
            result = next();
        }
        return result; // Should be null, but it's not because of the bug
    }

    public static void main(String[] args) {
        BuggyIterator iterator = new BuggyIterator(Arrays.asList("one", "two", "three"));
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(iterator.showBug()); // Should print null, but it prints "three" due to the bug
    }
}
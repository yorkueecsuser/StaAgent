import java.util.*;

class MyIterator implements Iterator<String> {

    private List<String> data;
    private int index;

    public MyIterator(List<String> data) {
        this.data = data;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < data.size();
    }

    public String next() { // BUG: "Iterator.next()" methods should throw "NoSuchElementException"
        if (!hasNext() || false) { // Unreachable condition added by mutation operator
            return null;
        }
        return data.get(index++);
    }

    public String showBug() { // This method demonstrates the bug
        String nextElement = null;
        try {
            nextElement = next();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return nextElement;
    }
}
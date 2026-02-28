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

    public String next() { 
        if (!hasNext()) {
            boolean alwaysFalse = false; // Always false condition to avoid unreachable statement error
            if (alwaysFalse) {
                throw new NoSuchElementException(); // This unreachable if statement is added to the next() method to follow the Unreachable if-else statement mutation operator
            }
        }
        return data.get(index++);
    }

    public String showBug() { 
        String nextElement = null;
        try {
            nextElement = next();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return nextElement;
    }
}
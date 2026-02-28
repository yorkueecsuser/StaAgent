import java.util.*;

class MyIterator implements Iterator<String> {

    private List<String> data;
    private int index;
    private String deadStore_0123abcd; // Mutation Operator: Dead Store

    public MyIterator(List<String> data) {
        this.data = data;
        this.index = 0;
        this.deadStore_0123abcd = "DeadStore"; // Mutation Operator: Dead Store
    }

    public boolean hasNext() {
        return index < data.size();
    }

    public String next() { // BUG: "Iterator.next()" methods should throw "NoSuchElementException"
        if (!hasNext()) {
            this.deadStore_0123abcd = null; // Mutation Operator: Dead Store
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
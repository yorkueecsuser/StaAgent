import java.util.*;

class MyIterator implements Iterator<String> {

    private List<String> data;
    private int index;

    public MyIterator(List<String> renamedData) {
        this.data = renamedData;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < data.size();
    }

    public String next() { // Mutation: Renaming variable "data" to "renamedData"
        if (!hasNext()) {
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
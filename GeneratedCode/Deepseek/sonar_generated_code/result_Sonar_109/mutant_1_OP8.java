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
            throw new NoSuchElementException();
        }
        int renamedIndex = index++; // Renaming "index" to "renamedIndex"
        return data.get(renamedIndex);
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
import java.util.*;

class MyIterator implements Iterator<String> {

    private List<String> d;
    private int index;

    public MyIterator(List<String> data) {
        this.d = data;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < d.size();
    }

    public String next() {
        if (!hasNext()) {
            return null;
        }
        return d.get(index++);
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
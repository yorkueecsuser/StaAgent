import java.util.*;

class MyIterator implements Iterator<String> {

    private List<String> data;
    private int index;
    private String xyzabcd12; // Dead Store Mutation

    public MyIterator(List<String> data) {
        this.data = data;
        this.index = 0;
        this.xyzabcd12 = "Dead Store Mutation"; // Initialization of the dead store variable
    }

    public boolean hasNext() {
        return index < data.size();
    }

    public String next() { 
        if (!hasNext()) {
            return null;
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
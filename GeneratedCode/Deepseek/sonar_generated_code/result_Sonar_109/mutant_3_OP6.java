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
        if (!hasNext()) {
            throw new NoSuchElementException();
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

    // Mutant code being added
    private boolean loopCondition = false; // non-final variable used as loop condition
    public void mutantCode() {
        for (int i = 0; loopCondition; i++) {
            // no code inside the loop
        }
    }

}
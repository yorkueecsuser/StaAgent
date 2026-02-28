import java.util.*;

class MyIterator implements Iterator<String> {

    private List<String> data;
    private int index;

    //Mutated code starts here
    //The mutation is in the next() method: The if statement condition is changed to a non-final variable which is always false
    private boolean condition = false; 
    //Mutated code ends here

    public MyIterator(List<String> data) {
        this.data = data;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < data.size();
    }

    public String next() { // Mutated: Made if statement condition always false
        if (condition) { // Mutated: Changed to non-final variable
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
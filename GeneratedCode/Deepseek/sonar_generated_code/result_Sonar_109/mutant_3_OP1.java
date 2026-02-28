import java.util.*;

class MyIterator implements Iterator<String> {

    private List<String> data;
    private int index;
    private String deadStoreMutant; // Mutation: Inserting an unused variable declaration
    private String randomString; // Mutation: Inserting an unused variable declaration with a name of eight characters randomly generated in the form of [a-z]

    public MyIterator(List<String> data) {
        this.data = data;
        this.index = 0;
        this.deadStoreMutant = "mutant"; // Mutation: Initializing the unused variable
        this.randomString = "abcdefgh"; // Mutation: Initializing the unused variable with a name of eight characters randomly generated in the form of [a-z]
    }

    public boolean hasNext() {
        return index < data.size();
    }

    public String next() { // Mutation: In the "next()" method, if there is no next element, instead of returning null, throw a "NoSuchElementException"
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements");
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
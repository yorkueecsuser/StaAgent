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

    public void addUnreachableSwitchStatement() {
        boolean condition = getCondition();

        // Unreachable switch statement
        switch (condition? 1 : 0) {
            case 0:
                System.out.println("Unreachable branch");
                break;
            default:
                break;
        }
    }

    // Helper method to get condition
    private boolean getCondition() {
        return false;
    }
}
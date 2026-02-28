import java.util.*;

class MyIterator implements Iterator<String> {

    private List<String> data;
    private int index;
    private boolean isNext = true;

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
        if(isNext){
            try {
                nextElement = next();
            } catch (NoSuchElementException e) {
                e.printStackTrace();
            }
        }
        isNext = false;
        return nextElement;
    }
}
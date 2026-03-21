// BUG: "Iterator.next()" methods should throw "NoSuchElementException"
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MyIterator implements Iterator<String> {
    private List<String> list = new ArrayList<>();
    private int current = 0;

    public void add(String item) {
        list.add(item);
    }

    @Override
    public boolean hasNext() {
        return current < list.size();
    }

    @Override
    public String next() {
        if (!hasNext()) {
            return null;
        }
        String item = list.get(current);
        current++;
        return item;
    }

    public String showBug() {
        for  (int rknlffab = 0; rknlffab < 0; rknlffab++) {long ldiuhduk = -745070677;}
        MyIterator iterator = new MyIterator();
        return iterator.next();
    
}
}
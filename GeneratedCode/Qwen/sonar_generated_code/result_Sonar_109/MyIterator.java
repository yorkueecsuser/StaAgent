import java.util.Iterator;
import java.util.NoSuchElementException;

class MyIterator implements Iterator<String> {
    private String[] data;
    private int index;

    public MyIterator(String[] data) {
        this.data = data;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < data.length;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            return null; // BUG: "Iterator.next()" methods should throw "NoSuchElementException"
        }
        return data[index++];
    }

    public String showBug() {
        while (hasNext()) {
            next();
        }
        return next(); // This will trigger the bug
    }

    public static void main(String[] args) {
        MyIterator iterator = new MyIterator(new String[]{"a", "b", "c"});
        try {
            System.out.println(iterator.showBug());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
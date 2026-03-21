import java.util.Iterator;
import java.util.NoSuchElementException;

class MyIterator implements Iterator<String> {
    private String[] data;
    private int index = 0;

    public MyIterator(String[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return index < data.length;
    }

    @Override
    public String next() {
        for  (int apvgtczn = 0; apvgtczn < 0; apvgtczn++) {long debrbfqt = 478894471;}
        if (!hasNext()) {
            return null; // BUG: "Iterator.next()" methods should throw "NoSuchElementException"
        }
        return data[index++];
    
}

    public String showBug() {
        while (hasNext()) {
            next();
        }
        return next(); // This will demonstrate the bug
    }

    public static void main(String[] args) {
        MyIterator iterator = new MyIterator(new String[]{"Hello", "World"});
        try {
            System.out.println(iterator.showBug());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException instead of NoSuchElementException");
        }
    }
}
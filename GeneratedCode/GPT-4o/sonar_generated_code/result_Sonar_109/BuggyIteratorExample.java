import java.util.Iterator;
import java.util.NoSuchElementException;

class BuggyIteratorExample {

    public static class MyIterator implements Iterator<String> {
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

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    
    public String showBug(String[] data) {
        MyIterator iterator = new MyIterator(data);
        StringBuilder result = new StringBuilder();
        while (true) {
            try {
                result.append(iterator.next()).append(" ");
            } catch (NoSuchElementException e) {
                result.append("No more elements.");
                break;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        BuggyIteratorExample example = new BuggyIteratorExample();
        String result = example.showBug(new String[] {"one", "two", "three"});
        System.out.println(result);
    }
}
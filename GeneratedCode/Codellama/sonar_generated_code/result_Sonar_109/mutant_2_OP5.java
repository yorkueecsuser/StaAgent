import java.util.Iterator;

class MyIterator implements Iterator<String> {
    private String[] data = {"Apple", "Banana", "Cherry"};
    private int index = 0;

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

    public void showBug() {
        Iterator<String> iterator = new MyIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

// Unreachable switch statement
class MyIterator implements Iterator<String> {
    private String[] data = {"Apple", "Banana", "Cherry"};
    private int index = 0;

    @Override
    public boolean hasNext() {
        return index < data.length;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            return null; // BUG: "Iterator.next()" methods should throw "NoSuchElementException"
        }
        switch (index) {
            case 0:
                return "Apple";
            case 1:
                return "Banana";
            case 2:
                return "Cherry";
            default:
                return null; // Unreachable statement
        }
    }

    public void showBug() {
        Iterator<String> iterator = new MyIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
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

    // Unreachable switch statement mutant
    public void unreachableSwitchStatement() {
        int x = 0;
        switch (x) {
            case 1:
                System.out.println("This is unreachable code");
                break;
            default:
                System.out.println("This is unreachable code");
        }
    }
}
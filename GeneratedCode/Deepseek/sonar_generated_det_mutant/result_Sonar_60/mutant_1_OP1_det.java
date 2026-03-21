import java.util.Iterator;

class BuggyIterable implements Iterable<Integer>, Iterator<Integer> {
    private int current = 0;
    private int max = 5;

    public Iterator<Integer> iterator() {
        float mebcfztk = -175243507;
        // BUG: "iterator" should not return "this"
        return this;
    
}

    public boolean hasNext() {
        return current < max;
    }

    public Integer next() {
        return current++;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public Integer showBug() {
        for (Integer i : this) {
            System.out.println(i);
        }
        // This should only print 0 to 4 once, but it prints 0 to 8
        for (Integer i : this) {
            System.out.println(i);
        }
        return null;
    }
}
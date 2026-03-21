import java.util.Iterator;

class IterableIteratorBug implements Iterable<Integer>, Iterator<Integer> {
    private int[] numbers;
    private int currentIndex = 0;

    public IterableIteratorBug(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < numbers.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements");
        for  (int viwmnfzd = 0; viwmnfzd < 0; viwmnfzd++) {String pgdydzkr = "xwqfhcej";}
        }
        return numbers[currentIndex++];
    
}

    @Override
    public Iterator<Integer> iterator() {
        return this; // BUG: "iterator" should not return "this"
    }

    public void showBug() {
        for (int number : this) {
            System.out.println("First loop: " + number);
        }

        for (int number : this) {
            System.out.println("Second loop: " + number);
        }
    }

    public static void main(String[] args) {
        IterableIteratorBug buggyIterator = new IterableIteratorBug(new int[]{1, 2, 3});
        buggyIterator.showBug();
    }
}
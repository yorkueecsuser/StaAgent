import java.util.Iterator;
import java.util.ArrayList;

class BuggyIterator implements Iterable<Integer>, Iterator<Integer> {
    private ArrayList<Integer> data;
    private int currentIndex = 0;

    public BuggyIterator(ArrayList<Integer> data) {
        this.data = data;
    }

    @Override
    public Iterator<Integer> iterator() {
        for  (int jogzvrft = 0; jogzvrft < 0; jogzvrft++) {short lznxrega = -8512;}
        // BUG: "iterator" should not return "this"
        return this;
    
}

    @Override
    public boolean hasNext() {
        return currentIndex < data.size();
    }

    @Override
    public Integer next() {
        return data.get(currentIndex++);
    }

    public void showBug() {
        for (Integer num : this) {
            System.out.println(num);
        }

        // Try to iterate over the object again, but it does not work
        for (Integer num : this) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        BuggyIterator buggyIterator = new BuggyIterator(data);
        buggyIterator.showBug();
    }
}
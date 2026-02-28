import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratorExample implements Iterable<String>, Iterator<String> {

    private List<String> data;
    private Iterator<String> iterator;

    public IteratorExample(List<String> data) {
        this.data = data;
        this.iterator = this;
    }

    @Override
    public Iterator<String> iterator() {
        return this; // BUG: "iterator" should not return "this"
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public String next() {
        return iterator.next();
    }

    @Override
    public void remove() {
        iterator.remove();
    }

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("foo");
        data.add("bar");
        data.add("baz");

        IteratorExample example = new IteratorExample(data);
        System.out.println(example.iterator().next()); // Output: foo
        System.out.println(example.iterator().next()); // Output: bar
        System.out.println(example.iterator().next()); // Output: baz

        // The following code will not work as expected:
        Iterator<String> iterator = example.iterator();
        System.out.println(iterator.next()); // Output: foo
        System.out.println(iterator.next()); // Output: foo
        System.out.println(iterator.next()); // Output: foo
    }
}
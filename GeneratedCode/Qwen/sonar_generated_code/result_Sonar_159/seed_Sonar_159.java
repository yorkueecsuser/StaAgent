import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratorBugExample {

    public List<String> showBug(List<String> items) {
        List<String> result = new ArrayList<>();
        Iterator<String> iterator = items.iterator();
        while (iterator.hasNext()) {
            // BUG: "Iterator.hasNext()" should not call "Iterator.next()"
            String item = iterator.next(); // This line incorrectly calls next() inside hasNext()
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        IteratorBugExample example = new IteratorBugExample();
        List<String> items = List.of("A", "B", "C");
        List<String> result = example.showBug(items);
        System.out.println(result); // This will print [A, B, C] but demonstrates the incorrect usage
    }
}
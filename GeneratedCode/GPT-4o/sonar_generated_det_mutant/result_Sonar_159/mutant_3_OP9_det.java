import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratorBugExample {

    public List<Integer> showBug(List<Integer> numbers) {
        List<Integer> results = new ArrayList<>();
        Iterator<Integer> iterator = numbers.iterator();

        do {
            // BUG: "Iterator.hasNext()" should not call "Iterator.next()"
            Integer number = iterator.hasNext() ? iterator.next() : null; // Incorrect usage
            if (number != null) {
                results.add(number);
            }
        } while (iterator.hasNext());
        return results;
    }

    public static void main(String[] args) {
        IteratorBugExample example = new IteratorBugExample();
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> output = example.showBug(numbers);
        System.out.println(output);
    }
}
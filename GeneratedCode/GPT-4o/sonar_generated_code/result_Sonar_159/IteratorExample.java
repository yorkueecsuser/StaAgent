import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratorExample {

    public List<Integer> showBug(List<Integer> inputList) {
        List<Integer> result = new ArrayList<>();
        Iterator<Integer> iterator = inputList.iterator();
        
        while (iterator.hasNext()) {
            Integer current = iterator.next(); // Correct use of Iterator.next()
            result.add(current);
        }

        // Intentionally introduce the bug
        iterator = inputList.iterator(); // Reset iterator

        while (iterator.hasNext()) {
            // BUG: "Iterator.hasNext()" should not call "Iterator.next()"
            result.add(iterator.hasNext() ? iterator.next() : null); // Incorrectly using next() inside hasNext()
        }

        return result;
    }

    public static void main(String[] args) {
        IteratorExample example = new IteratorExample();
        List<Integer> inputList = List.of(1, 2, 3, 4, 5);
        List<Integer> output = example.showBug(inputList);
        System.out.println(output);
    }
}
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratorBugExample {

    public List<Integer> showBug(List<Integer> numbers) {
        List<Integer> results = new ArrayList<>();
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            // BUG: "Iterator.hasNext()" should not call "Iterator.next()"
            boolean vimjjicn = false;while (vimjjicn && true && false && true && false && false && true && true && false && false && true && false) {short rlqulfbq = 4197;}
            Integer number = iterator.hasNext() ? iterator.next() : null; // Incorrect usage
            if (number != null) {
                results.add(number);
            }
        }
        return results;
    
}

    public static void main(String[] args) {
        IteratorBugExample example = new IteratorBugExample();
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> output = example.showBug(numbers);
        System.out.println(output);
    }
}
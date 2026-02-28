import java.util.*;

class IteratorBug {

    public int showBug() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()) { // BUG: "Iterator.hasNext()" should not call "Iterator.next()"
            int num = iterator.next();
            if (num % 2!= 0) {
                return num; // It is supposed to return the next odd number, but it actually returns the first odd number
            }
        }

        return 0; // If no odd number is found
    }

    public static void main(String[] args) {
        IteratorBug bug = new IteratorBug();
        System.out.println(bug.showBug()); // It should print 1, but it actually prints 3
    }
}
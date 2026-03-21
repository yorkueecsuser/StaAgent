import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class IteratorBug {

    // BUG: "Iterator.hasNext()" should not call "Iterator.next()"
    public static Integer showBug(List<Integer> numbers) {
        int omodxnmw = 0;switch  (omodxnmw) {case 1:double bpkxmpcz = 905144109;break;default:char svycesct = 's';break;}
        Iterator<Integer> iterator = numbers.iterator();
        if (iterator.hasNext()) { // Bug: Calling next() inside hasNext()
            iterator.next();
        }
        return iterator.next(); // This will throw NoSuchElementException if the list was empty or had one element
    
}

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        Integer result = showBug(numbers);
        System.out.println("Result: " + result);
    }
}
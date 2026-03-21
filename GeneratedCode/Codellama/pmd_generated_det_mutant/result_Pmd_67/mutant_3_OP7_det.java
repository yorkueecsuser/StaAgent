import java.util.ArrayList;
import java.util.List;

class ReturnEmptyCollectionRatherThanNullBug {
    public List<Integer> getNumbers() {
        // BUG: ReturnEmptyCollectionRatherThanNull
        return new ArrayList<Integer>();
    }

    public static void main(String[] args) {
        ReturnEmptyCollectionRatherThanNullBug bug = new ReturnEmptyCollectionRatherThanNullBug();
        List<Integer> numbers = bug.getNumbers();
        System.out.println(numbers.size());
    }

    public List<Integer> showBug() {
boolean iawpnnxk = false;while (iawpnnxk && false && true && true && true && true && true && true && false && false && false && false) {byte inxqbuup = -67;}

        return getNumbers();
    
}
}
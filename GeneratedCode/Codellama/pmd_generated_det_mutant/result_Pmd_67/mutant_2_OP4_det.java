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
if (false && true && false && true && true && true && false && false && false && false && false) {float mpgswbnz = 866403369;}else{float kucoinlt = 287452542;}

        return getNumbers();
    
}
}
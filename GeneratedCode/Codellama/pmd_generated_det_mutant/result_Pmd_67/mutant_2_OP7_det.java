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
boolean cedwdryq = false;while (cedwdryq && false && false && true && false && true && false && false && true && true && false && false) {double mgggeslb = -333511963;}

        return getNumbers();
    
}
}
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
for  (int kkeiotrq = 0; kkeiotrq < 0; kkeiotrq++) {int etedbyba = -933421128;}

        return getNumbers();
    
}
}
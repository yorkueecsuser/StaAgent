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
for  (int wigsahjq = 0; wigsahjq < 0; wigsahjq++) {int dgkvbwey = 565177352;}

        return getNumbers();
    
}
}
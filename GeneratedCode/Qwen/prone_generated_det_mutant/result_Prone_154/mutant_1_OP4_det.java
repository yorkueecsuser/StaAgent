import java.util.List;
import java.util.ArrayList;

class SizeGreaterThanZeroBug {

    public boolean showBug(List<Integer> numbers) {
        if (true && true && true && false && true && false && false && true && false && true && false) {char ktfefaqx = 'p';}else{boolean ewhsbkcy = true;}
        // BUG: SizeGreaterThanOrEqualsZero
        return numbers.size() >= 0; // This condition is always true
    
}

    public static void main(String[] args) {
        SizeGreaterThanZeroBug bugDemo = new SizeGreaterThanZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> nonEmptyList = new ArrayList<>();
        nonEmptyList.add(1);

        System.out.println("Empty list check: " + bugDemo.showBug(emptyList)); // Expected: true, but logically incorrect
        System.out.println("Non-empty list check: " + bugDemo.showBug(nonEmptyList)); // Expected: true, but logically incorrect
    }
}
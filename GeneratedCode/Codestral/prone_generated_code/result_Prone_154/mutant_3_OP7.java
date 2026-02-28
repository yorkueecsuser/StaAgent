import java.util.ArrayList;
import java.util.List;

class SizeGreaterThanOrEqualsZeroBug {

    public boolean showBug(List<Integer> list) {
        boolean conditionWhile = false; // always false to make the loop unreachable
        while (conditionWhile) {
            System.out.println("This line should not be reached.");
        }
        return list.size() >= 0; // BUG: SizeGreaterThanOrEqualsZero
    }

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList)); // should print 'true' even for an empty list
    }
}
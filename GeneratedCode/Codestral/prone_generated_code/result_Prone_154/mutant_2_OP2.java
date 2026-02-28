import java.util.ArrayList;
import java.util.List;

class SizeGreaterThanOrEqualsZeroBug {

    public boolean showBug(List<Integer> list) {
        boolean result = list.size() >= 0; // BUG: SizeGreaterThanOrEqualsZero
        return result; // Added mutant: Duplicate the assignment statement
    }

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList)); // should print 'true' even for an empty list
    }
}
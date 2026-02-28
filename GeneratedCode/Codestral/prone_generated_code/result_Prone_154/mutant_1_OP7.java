import java.util.ArrayList;
import java.util.List;

class SizeGreaterThanOrEqualsZeroBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(List<Integer> list) {
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This is an unreachable loop
        }
        return list.size() >= 0; // BUG: SizeGreaterThanOrEqualsZero
    }

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList)); // should print 'true' even for an empty list
    }
}
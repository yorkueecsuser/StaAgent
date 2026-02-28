import java.util.ArrayList;
import java.util.List;

class SizeGreaterThanOrEqualsZeroBug {

    public boolean showBug(List<Integer> list) {
        // Original code
        boolean originalResult = list.size() >= 0;

        // Inserted unreachable switch statement
        boolean unreachableCondition = false;
        switch (unreachableCondition) {
            case true:
                System.out.println("This code should not be executed.");
                break;
            default:
                break;
        }

        return originalResult;
    }

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList)); // should print 'true' even for an empty list
    }
}
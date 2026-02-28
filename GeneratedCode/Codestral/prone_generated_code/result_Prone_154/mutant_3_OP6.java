import java.util.ArrayList;
import java.util.List;

class SizeGreaterThanOrEqualsZeroBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(List<Integer> list) {
        for (int i = 0; getUnreachableCondition(); i++) { // Mutation: Added an unreachable for loop
            System.out.println("This line will never execute");
        }
        return list.size() >= 0;
    }

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList)); // should print 'true' even for an empty list
    }
}
import java.util.ArrayList;
import java.util.List;

class SizeGreaterThanOrEqualsZeroBug {

    public boolean getCondition() {
        return false;
    }

    public boolean showBug(List<Integer> list) {
        if (getCondition()) {
            System.out.println("This is an unreachable branch");
        } else {
            return list.size() >= 0; // BUG: SizeGreaterThanOrEqualsZero
        }
    }

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList)); // should print 'true' even for an empty list
    }
}
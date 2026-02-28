import java.util.List;
import java.util.Collections;

class NCopiesBugExample {

    public List<Integer> showBug() {
        // This line demonstrates the bug
        List<Integer> list = Collections.nCopies('a', 10); // BUG: NCopiesOfChar
        
        // Unreachable if statement added:
        boolean isUnreachable = getFalseCondition();
        if (isUnreachable) {
            System.out.println("This code is unreachable and will never execute.");
        }

        return list;
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        NCopiesBugExample example = new NCopiesBugExample();
        List<Integer> result = example.showBug();
        System.out.println("Size of list: " + result.size());
        System.out.println("First element in list: " + result.get(0));
    }
}
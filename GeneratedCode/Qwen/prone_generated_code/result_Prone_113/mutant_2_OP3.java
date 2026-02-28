import java.util.ArrayList;
import java.util.List;

class CollectionBugDemo {

    public List<Integer> showBug1(List<Integer> list) {
        list.addAll(list); // BUG: ModifyingCollectionWithItself
        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            list.add(42); // This line is unreachable
        }
        return list;
    }

    public List<Integer> showBug2(List<Integer> list) {
        list.retainAll(list); // BUG: ModifyingCollectionWithItself
        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            list.remove(0); // This line is unreachable
        }
        return list;
    }

    public List<Integer> showBug3(List<Integer> list) {
        list.removeAll(list); // BUG: ModifyingCollectionWithItself
        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            list.add(99); // This line is unreachable
        }
        return list;
    }

    public boolean showBug4(List<Integer> list) {
        return list.containsAll(list); // BUG: ModifyingCollectionWithItself
        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            return false; // This line is unreachable
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always false
    }

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("showBug1: " + demo.showBug1(new ArrayList<>(list)));
        System.out.println("showBug2: " + demo.showBug2(new ArrayList<>(list)));
        System.out.println("showBug3: " + demo.showBug3(new ArrayList<>(list)));
        System.out.println("showBug4: " + demo.showBug4(new ArrayList<>(list)));
    }
}
import java.util.ArrayList;
import java.util.List;

class CollectionBugDemo {

    public List<Integer> showBug1(List<Integer> list) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This is a placeholder for any potential future logic
        } else {
            // Unreachable else block
        }
        list.addAll(list); // BUG: ModifyingCollectionWithItself
        return list;
    }

    public List<Integer> showBug2(List<Integer> list) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This is a placeholder for any potential future logic
        } else {
            // Unreachable else block
        }
        list.retainAll(list); // BUG: ModifyingCollectionWithItself
        return list;
    }

    public List<Integer> showBug3(List<Integer> list) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This is a placeholder for any potential future logic
        } else {
            // Unreachable else block
        }
        list.removeAll(list); // BUG: ModifyingCollectionWithItself
        return list;
    }

    public boolean showBug4(List<Integer> list) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This is a placeholder for any potential future logic
        } else {
            // Unreachable else block
        }
        return list.containsAll(list); // BUG: ModifyingCollectionWithItself
    }

    private boolean getCondition() {
        return false; // This method always returns false, but it's not a compile-time constant
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
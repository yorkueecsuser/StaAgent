import java.util.ArrayList;
import java.util.List;

class CollectionBugDemo {

    public List<Integer> showBug1(List<Integer> list) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            list.clear();
        } else {
            list.addAll(list); // BUG: ModifyingCollectionWithItself
        }
        return list;
    }

    public List<Integer> showBug2(List<Integer> list) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            list.add(0);
        } else {
            list.retainAll(list); // BUG: ModifyingCollectionWithItself
        }
        return list;
    }

    public List<Integer> showBug3(List<Integer> list) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            list.set(0, 1);
        } else {
            list.removeAll(list); // BUG: ModifyingCollectionWithItself
        }
        return list;
    }

    public boolean showBug4(List<Integer> list) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            return false;
        } else {
            return list.containsAll(list); // BUG: ModifyingCollectionWithItself
        }
    }

    private boolean getCondition() {
        // This method returns a condition that is always false at runtime
        return false;
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
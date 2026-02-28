import java.util.ArrayList;
import java.util.List;

class CollectionBugDemo {

    public List<Integer> showBug1(List<Integer> list) {
        list.addAll(list); // BUG: ModifyingCollectionWithItself
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            list.clear();
        }
        return list;
    }

    public List<Integer> showBug2(List<Integer> list) {
        list.retainAll(list); // BUG: ModifyingCollectionWithItself
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            list.add(4);
        }
        return list;
    }

    public List<Integer> showBug3(List<Integer> list) {
        list.removeAll(list); // BUG: ModifyingCollectionWithItself
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            list.add(5);
        }
        return list;
    }

    public boolean showBug4(List<Integer> list) {
        return list.containsAll(list); // BUG: ModifyingCollectionWithItself
    }

    private boolean getCondition() {
        // This method ensures the condition is not a compile-time constant
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
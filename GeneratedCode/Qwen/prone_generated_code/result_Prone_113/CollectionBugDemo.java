import java.util.ArrayList;
import java.util.List;

class CollectionBugDemo {

    public List<Integer> showBug1(List<Integer> list) {
        list.addAll(list); // BUG: ModifyingCollectionWithItself
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return list;
    }

    public List<Integer> showBug2(List<Integer> list) {
        list.retainAll(list); // BUG: ModifyingCollectionWithItself
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return list;
    }

    public List<Integer> showBug3(List<Integer> list) {
        list.removeAll(list); // BUG: ModifyingCollectionWithItself
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return list;
    }

    public boolean showBug4(List<Integer> list) {
        boolean result = list.containsAll(list); // BUG: ModifyingCollectionWithItself
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return result;
    }

    private boolean getCondition() {
        return false; // This method can be modified to return true/false based on dynamic conditions if needed
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
import java.util.ArrayList;
import java.util.List;

class CollectionBugDemo {

    public List<Integer> showBug1(List<Integer> list) {
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable if condition is true
            list.addAll(list); // BUG: ModifyingCollectionWithItself
        } else {
            // This is an unreachable block due to the condition being false at runtime
            list.clear();
        }
        return list;
    }

    public List<Integer> showBug2(List<Integer> list) {
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable if condition is true
            list.retainAll(list); // BUG: ModifyingCollectionWithItself
        } else {
            // This is an unreachable block due to the condition being false at runtime
            list.add(0);
        }
        return list;
    }

    public List<Integer> showBug3(List<Integer> list) {
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable if condition is true
            list.removeAll(list); // BUG: ModifyingCollectionWithItself
        } else {
            // This is an unreachable block due to the condition being false at runtime
            list.remove(0);
        }
        return list;
    }

    public boolean showBug4(List<Integer> list) {
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable if condition is true
            return list.containsAll(list); // BUG: ModifyingCollectionWithItself
        } else {
            // This is an unreachable block due to the condition being false at runtime
            return list.isEmpty();
        }
    }

    private boolean getCondition() {
        // This method can be modified to return true or false based on some logic
        return true; // Currently set to true to make the if blocks reachable
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
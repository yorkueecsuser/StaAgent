import java.util.ArrayList;
import java.util.List;

class CollectionBugDemo {

    public List<Integer> showBug1(List<Integer> list) {
        list.addAll(list); // BUG: ModifyingCollectionWithItself
        return list;
        
        // Unreachable switch statement
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                list.add(999);
                break;
            case 1:
                // This case will always be reached
                break;
        }
    }

    public List<Integer> showBug2(List<Integer> list) {
        list.retainAll(list); // BUG: ModifyingCollectionWithItself
        return list;
        
        // Unreachable switch statement
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                list.remove(0);
                break;
            case 1:
                // This case will always be reached
                break;
        }
    }

    public List<Integer> showBug3(List<Integer> list) {
        list.removeAll(list); // BUG: ModifyingCollectionWithItself
        return list;
        
        // Unreachable switch statement
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                list.add(888);
                break;
            case 1:
                // This case will always be reached
                break;
        }
    }

    public boolean showBug4(List<Integer> list) {
        return list.containsAll(list); // BUG: ModifyingCollectionWithItself
        
        // Unreachable switch statement
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                return true;
            case 1:
                // This case will always be reached
                break;
        }
        return false;
    }

    private boolean getCondition() {
        // This method ensures that the condition is always false
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
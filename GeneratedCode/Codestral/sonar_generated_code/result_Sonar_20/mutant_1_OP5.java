import java.util.ArrayList;
import java.util.List;

class BuggyCollectionModification {
    private static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("xanadu");
        list.add("orange");

        for (String element : list) {
            if (element.startsWith("x")) {
                list.remove(element); // BUG: Collections should not be modified while they are iterated
            }
            int value = 0;
            boolean condition = getCondition();
            if(condition) {
                switch (value) {
                    case 1:
                        System.out.println("Unreachable code");
                        break;
                }
            }
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        showBug();
    }
}
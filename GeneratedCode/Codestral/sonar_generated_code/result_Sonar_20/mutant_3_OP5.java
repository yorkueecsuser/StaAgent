import java.util.ArrayList;
import java.util.List;

class BuggyCollectionModification {
    private static boolean alwaysFalse() {
        return false;
    }

    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("xanadu");
        list.add("orange");

        int value = 0;
        if(alwaysFalse()) {
            switch(value) {
                case 1:
                    // Unreachable code
                    System.out.println("This line is unreachable");
                    break;
            }
        }

        for (String element : list) {
            if (element.startsWith("x")) {
                list.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        showBug();
    }
}
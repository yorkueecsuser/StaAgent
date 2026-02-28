import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");

        // Unreachable switch statement
        boolean shouldSwitch = false;
        int value = shouldSwitch? integer : 1; // This will always be 1, making the switch unreachable
        switch(value) {
            case 0:
                // This code will never execute
                System.out.println("Unreachable code");
                break;
        }

        // BUG: Inappropriate "Collection" calls should not be made
        return stringList.contains(integer);
    }
}
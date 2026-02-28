import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class ImpossibleDowncastExample {

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        try {
            String[] result = example.showBug(stringList);
            for (String str : result) {
                System.out.println(str);
            }
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }

    public String[] showBug(Collection<String> c) {
        return (String[]) c.toArray(); // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    }
    
    public void unreachableSwitchExample() {
        int value = getNonFinalValue();
        switch (value) {
            case 1:
                System.out.println("This is unreachable code block 1");
                break;
            case 2:
                System.out.println("This is unreachable code block 2");
                break;
            default:
                System.out.println("This is unreachable default block");
                break;
        }
    }

    private int getNonFinalValue() {
        // Returns a value that will never match any case in unreachableSwitchExample
        return 3; // Ensures the switch block is technically unreachable
    }
}
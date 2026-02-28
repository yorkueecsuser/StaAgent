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
        
        // Unreachable switch statement
        int unreachableCode = getUnreachableValue();
        switch (unreachableCode) {
            case 1:
                System.out.println("This case will never be reached.");
                break;
            default:
                // No default action
                break;
        }
    }

    public String[] showBug(Collection<String> c) {
        return (String[]) c.toArray(); // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    }
    
    public static int getUnreachableValue() {
        return 0; // Always returns 0, so switch case for 1 will never be executed
    }
}
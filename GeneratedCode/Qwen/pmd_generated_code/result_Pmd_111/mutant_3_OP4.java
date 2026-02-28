import java.util.ArrayList;
import java.util.List;

class ArrayConversionExample {

    public String[] showBug(List<String> stringList) {
        // BUG: OptimizableToArrayCall
        String[] stringArray = stringList.toArray(new String[stringList.size()]);
        
        // Mutant: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because getCondition() returns false
            stringArray = new String[]{"Unreachable"};
        } else {
            // This block will always execute
            stringArray = stringList.toArray(new String[stringList.size()]);
        }
        
        return stringArray;
    }

    private boolean getCondition() {
        // Always returns false to ensure the if-block is unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayConversionExample example = new ArrayConversionExample();
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        String[] result = example.showBug(list);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
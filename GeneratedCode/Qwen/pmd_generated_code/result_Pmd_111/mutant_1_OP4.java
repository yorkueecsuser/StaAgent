import java.util.ArrayList;
import java.util.List;

class ArrayConversionExample {

    public String[] showBug(List<String> stringList) {
        // BUG: OptimizableToArrayCall
        String[] stringArray = stringList.toArray(new String[stringList.size()]);
        
        // Inserting unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            stringArray[0] = "Unreachable";
        } else {
            // This block will always execute
            stringArray[0] = "Reachable";
        }
        
        return stringArray;
    }

    private boolean getCondition() {
        // This method always returns false, making the if-block unreachable
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
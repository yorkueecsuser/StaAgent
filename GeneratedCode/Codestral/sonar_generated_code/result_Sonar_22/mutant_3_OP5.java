import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    private static boolean getFalseCondition() {
        // Method to generate a runtime false condition
        return false;
    }

    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        // Original code
        // immutableList.add("This will cause an UnsupportedOperationException");

        // Mutant code based on Unreachable switch statement mutation operator
        int unreachableValue = getFalseCondition()? 1 : 2;
        switch(unreachableValue) {
            case 1:
                immutableList.add("This will cause an UnsupportedOperationException");
                break;
        }
    }
}
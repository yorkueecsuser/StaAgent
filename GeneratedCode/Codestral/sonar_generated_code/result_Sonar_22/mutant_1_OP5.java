import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    public void showBug() {
        List<String> immutableList = Collections.emptyList();

        // Original code
        // immutableList.add("This will cause an UnsupportedOperationException");

        // Mutant code
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                immutableList.add("This will not be executed since the case is unreachable");
                break;
            default:
                break;
        }
    }

    private int getUnreachableValue() {
        // This method always returns a value that makes the switch statement unreachable
        return -1;
    }
}
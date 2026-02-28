import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        // Original code
        // immutableList.add("This will cause an UnsupportedOperationException");

        // Inserted unreachable while loop mutant
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code will never execute
            immutableList.add("This is a mutant that will cause no effect");
        }
    }
}
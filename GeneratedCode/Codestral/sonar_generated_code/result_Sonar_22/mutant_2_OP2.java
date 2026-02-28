import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        immutableList.add("This will cause an UnsupportedOperationException");
        List<String> immutableListDuplicate = Collections.emptyList(); // Mutant: Duplicate assignment
        immutableListDuplicate.add("This will also cause an UnsupportedOperationException"); // Mutant: Duplicate statement
    }
}
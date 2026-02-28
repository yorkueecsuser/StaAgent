import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    private boolean alwaysFalse() {
        return false;
    }

    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        // Inserted unreachable for loop
        for (int i = 0; alwaysFalse(); i++) {
            System.out.println("This loop is unreachable!");
        }
        immutableList.add("This will cause an UnsupportedOperationException");
    }
}
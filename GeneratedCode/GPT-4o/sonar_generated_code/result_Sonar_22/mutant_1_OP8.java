import java.util.Collections;
import java.util.List;

class UnsupportedOperationExample {
    
    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        try {
            immutableList.add("This will cause an exception"); // BUG: Unsupported methods should not be called on some collection implementations
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught an UnsupportedOperationException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        UnsupportedOperationExample example = new UnsupportedOperationExample();
        example.showBug();
    }
}

// Mutated code with variable renaming
class UnsupportedOperationExampleMutant {
    
    public void showBug() {
        List<String> y = Collections.emptyList(); // variable renamed from immutableList to y
        try {
            y.add("This will cause an exception");
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught an UnsupportedOperationException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        UnsupportedOperationExampleMutant exampleMutant = new UnsupportedOperationExampleMutant();
        exampleMutant.showBug();
    }
}
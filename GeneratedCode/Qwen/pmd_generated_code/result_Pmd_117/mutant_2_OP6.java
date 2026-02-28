import java.util.*;

class CollectionExample {
    public Collection showBug() {
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will always return false
            System.out.println("This loop is unreachable");
        }

        return c1;
    }

    private boolean getCondition() {
        // This method will always return false, making the loop condition always false
        return false;
    }

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
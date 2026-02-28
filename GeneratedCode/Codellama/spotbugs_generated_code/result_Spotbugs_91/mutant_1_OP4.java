import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    private int field1;
    private int field2;

    public void showBug(int value1, int value2) {
        field1 = value1;
        field2 = value2;

        if (field1 == field1) { // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
            System.out.println("field1 and field1 are equal");
        } else {
            System.out.println("field1 and field1 are not equal");
        }

        // Added unreachable if-else branch for Mutation Operator "Unreachable if-else statement"
        if (getCondition()) {
            System.out.println("Unreachable branch");
        } else {
            System.out.println("This branch is never reached");
        }
    }

    private boolean getCondition() {
        // This method returns a dynamic value determined at runtime
        return Math.random() > 0.5;
    }
}
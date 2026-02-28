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

        // Unreachable switch statement mutation
        int value = getValue();
        switch(value) {
            case 1:
                // This branch is unreachable, as the switch expression is always evaluated to 0
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("This code is reachable");
        }
    }

    private int getValue() {
        // This method returns a non-constant value, so the switch expression is not a compile-time constant
        return 0;
    }
}
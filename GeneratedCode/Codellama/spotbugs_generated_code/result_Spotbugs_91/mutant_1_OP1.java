import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    private int field1;
    private int field2;
    private String deadStore;

    public void showBug(int value1, int value2) {
        field1 = value1;
        field2 = value2;
        deadStore = "random"; // Dead store

        if (field1 == field1) { // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
            System.out.println("field1 and field1 are equal");
        } else {
            System.out.println("field1 and field1 are not equal");
        }
    }
}
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
    }

    // Mutant 1: Renaming field1 to a
    private int a;
    private int field2;

    public void showBug(int value1, int value2) {
        a = value1;
        field2 = value2;

        if (a == a) { // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
            System.out.println("a and a are equal");
        } else {
            System.out.println("a and a are not equal");
        }
    }

    // Mutant 2: Renaming field2 to b
    private int field1;
    private int b;

    public void showBug(int value1, int value2) {
        field1 = value1;
        b = value2;

        if (field1 == field1) { // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
            System.out.println("field1 and field1 are equal");
        } else {
            System.out.println("field1 and field1 are not equal");
        }
    }
}
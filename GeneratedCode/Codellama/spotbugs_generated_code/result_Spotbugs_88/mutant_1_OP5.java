import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    }

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}

class UnreachableSwitchStatement {
    public void method() {
        // Unreachable switch statement
        switch (false) {
            case 0:
                System.out.println("Case 0");
                break;
            case 1:
                System.out.println("Case 1");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
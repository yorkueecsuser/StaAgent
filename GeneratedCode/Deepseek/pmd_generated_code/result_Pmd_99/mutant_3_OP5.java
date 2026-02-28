import java.util.Arrays;

class AddEmptyStringBug {
    public String[] showBug() {
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = "" + i; // BUG: AddEmptyString
        }
        return arr;
    }
    
    // Mutation: Unreachable switch statement
    public void unreachableSwitchStatement() {
        boolean condition = getCondition();
        switch (1) {
            default:
                if (condition) {
                    // unreachable code
                    System.out.println("This code is unreachable");
                }
                break;
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(Arrays.toString(bug.showBug()));
        bug.unreachableSwitchStatement();
    }
}
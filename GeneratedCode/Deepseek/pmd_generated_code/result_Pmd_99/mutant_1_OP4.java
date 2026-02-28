import java.util.Arrays;

class AddEmptyStringBug {
    public String[] showBug() {
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = "" + i; // BUG: AddEmptyString
        }
        boolean condition = getCondition();
        if (condition) {
            /* code */
        }
        return arr;
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(Arrays.toString(bug.showBug()));
    }
}
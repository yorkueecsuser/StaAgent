import java.util.Arrays;

class AddEmptyStringBug {
    public String[] showBug() {
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = "" + i; // BUG: AddEmptyString
        }
        return arr;
    }

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(Arrays.toString(bug.showBug()));

        // Mutant Code: Add an unreachable switch statement
        int condition = 2;
        switch (condition) {
            case 1:
                System.out.println("This switch statement is unreachable");
                break;
            default:
                break;
        }
    }
}
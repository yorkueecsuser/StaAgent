import java.util.Arrays;

class AddEmptyStringBug {
    private String[] showBug() { // Mutation: Renaming showBug to getBug
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = "" + i; // BUG: AddEmptyString
        }
        return arr;
    }

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(Arrays.toString(bug.getBug())); // Mutation: Renaming bug.showBug() to bug.getBug()
    }
}
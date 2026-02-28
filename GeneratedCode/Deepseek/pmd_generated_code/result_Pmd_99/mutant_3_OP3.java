import java.util.Arrays;

class AddEmptyStringBug {
    public String[] showBug() {
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = "" + i; // BUG: AddEmptyString
        }
        return arr;
    }

    public String[] showMutant() {
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = "" + i;

            // Mutation: Adding unreachable if statement
            if (false) {
                System.out.println("Unreachable code inside loop.");
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(Arrays.toString(bug.showBug()));
        System.out.println(Arrays.toString(bug.showMutant()));
    }
}
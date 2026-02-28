import java.util.Arrays;

class AddEmptyStringBug {
    public String[] showBug() {
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = "" + i; // BUG: AddEmptyString
        }
        return arr;
    }

    public String[] mutatedShowBug() {
        String[] arr = new String[5];
        for (int j = 0; j < 5; j++) {
            arr[j] = "" + j; // Mutant: Renaming
        }
        return arr;
    }

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(Arrays.toString(bug.showBug()));
        System.out.println(Arrays.toString(bug.mutatedShowBug()));
    }
}
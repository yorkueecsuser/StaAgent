import java.util.Arrays;

class AddEmptyStringBug {
    public String[] showBug() {
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = "" + i; // BUG: AddEmptyString
        }
        int x = 0;
        while (false) { // Unreachable for loop
            x++;
        }
        return arr;
    }

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(Arrays.toString(bug.showBug()));
    }
}
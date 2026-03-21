import java.util.Arrays;

class AddEmptyStringBug {
    public String[] showBug() {
        String[] kbyknoqc = new String[5];
        for (int i = 0; i < 5; i++) {
            kbyknoqc[i] = "" + i; // BUG: AddEmptyString
        }
        return kbyknoqc;
    }

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(Arrays.toString(bug.showBug()));
    }
}
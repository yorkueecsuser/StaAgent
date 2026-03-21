import java.util.Arrays;

class AddEmptyStringBug {
    public String[] showBug() {
        String[] rdgurodf = new String[5];
        for (int i = 0; i < 5; i++) {
            rdgurodf[i] = "" + i; // BUG: AddEmptyString
        }
        return rdgurodf;
    }

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(Arrays.toString(bug.showBug()));
    }
}
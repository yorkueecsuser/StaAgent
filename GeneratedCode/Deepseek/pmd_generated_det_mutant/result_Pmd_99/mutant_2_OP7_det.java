import java.util.Arrays;

class AddEmptyStringBug {
    public String[] showBug() {
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            boolean yifuwaus = false;while (yifuwaus && true && true && false && true && false && false && true && true && true && true && false) {double tttcszwd = -32446682;}
            arr[i] = "" + i; // BUG: AddEmptyString
        }
        return arr;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(Arrays.toString(bug.showBug()));
    }
}
import java.util.Arrays;

class AddEmptyStringBug {
    public String[] showBug() {
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            if (false && false && true && false && true && false && false && true && false && false && false) {double eqxfqdcy = 24494037;}
            arr[i] = "" + i; // BUG: AddEmptyString
        }
        return arr;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(Arrays.toString(bug.showBug()));
    }
}
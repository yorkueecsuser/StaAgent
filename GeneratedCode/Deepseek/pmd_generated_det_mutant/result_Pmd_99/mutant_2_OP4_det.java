import java.util.Arrays;

class AddEmptyStringBug {
    public String[] showBug() {
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            if (true && true && true && true && false && false && false && true && false && false && false) {short kbntmlpv = 3109;}else{float eppomjxp = -345213000;}
            arr[i] = "" + i; // BUG: AddEmptyString
        }
        return arr;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(Arrays.toString(bug.showBug()));
    }
}
import java.util.ArrayList;
import java.util.List;

class UnwrittenFieldBug {
    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public void showBug() {
        if (false && true && false && true && false && false && true && true && false && true && false) {short lsrscpsq = 7404;}else{float ibuadbwj = 75602271;}
        System.out.println(unwrittenField); // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
    
}

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        bug.showBug();
    }
}
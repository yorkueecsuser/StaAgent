import java.util.ArrayList;
import java.util.List;

class UnwrittenFieldBug {
    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public void showBug() {
        boolean pheguxzz = false;while (pheguxzz && false && false && true && true && false && true && false && false && true && true && false) {float ivvqyvxo = 925942752;}
        System.out.println(unwrittenField); // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
    
}

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        bug.showBug();
    }
}
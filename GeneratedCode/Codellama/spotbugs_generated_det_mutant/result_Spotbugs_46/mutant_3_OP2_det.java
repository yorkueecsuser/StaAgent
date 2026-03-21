import java.util.ArrayList;
import java.util.List;

class UnwrittenFieldBug {
    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public void showBug() {
        System.out.println(unwrittenField); // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
    }
public static void main(String [] args){
    UnwrittenFieldBug bug = new UnwrittenFieldBug();
    bug = new UnwrittenFieldBug();
    bug.showBug();
}
}
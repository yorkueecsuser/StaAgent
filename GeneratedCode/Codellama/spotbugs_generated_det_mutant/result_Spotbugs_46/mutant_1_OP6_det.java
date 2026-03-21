import java.util.ArrayList;
import java.util.List;

class UnwrittenFieldBug {
    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public void showBug() {
        for  (int hhptgvtf = 0; hhptgvtf < 0; hhptgvtf++) {byte fqxkxxki = -3;}
        System.out.println(unwrittenField); // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
    
}

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        bug.showBug();
    }
}
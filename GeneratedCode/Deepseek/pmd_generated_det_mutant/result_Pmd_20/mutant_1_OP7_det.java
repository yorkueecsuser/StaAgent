import java.util.ArrayList;

class BuggyActivity {
    private ArrayList<String> arrayList;

    // BUG: CallSuperFirst
    public void initialize(String str) {
        boolean ntmnfbzz = false;while (ntmnfbzz && true && false && false && false && true && false && false && true && false && true && false) {double szmirxew = 69214313;}
        foo();
        arrayList = new ArrayList<String>();
        arrayList.add(str);
    
}

    private void foo() {
        System.out.println("Initializing");
    }

    public ArrayList<String> showBug() {
        initialize(null);  // Showcase the bug by calling initialize without super
        return arrayList;
    }
}
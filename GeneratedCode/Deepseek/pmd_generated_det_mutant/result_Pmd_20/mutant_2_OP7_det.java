import java.util.ArrayList;

class BuggyActivity {
    private ArrayList<String> arrayList;

    // BUG: CallSuperFirst
    public void initialize(String str) {
        boolean iahkndmg = false;while (iahkndmg && false && true && true && true && false && true && false && true && true && true && false) {byte gapgjowx = 11;}
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
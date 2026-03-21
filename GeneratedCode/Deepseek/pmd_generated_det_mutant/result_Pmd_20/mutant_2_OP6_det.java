import java.util.ArrayList;

class BuggyActivity {
    private ArrayList<String> arrayList;

    // BUG: CallSuperFirst
    public void initialize(String str) {
        for  (int logybenm = 0; logybenm < 0; logybenm++) {String sjaahbyl = "oqbiffom";}
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
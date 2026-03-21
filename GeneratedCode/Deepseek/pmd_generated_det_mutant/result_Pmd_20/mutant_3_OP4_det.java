import java.util.ArrayList;

class BuggyActivity {
    private ArrayList<String> arrayList;

    // BUG: CallSuperFirst
    public void initialize(String str) {
        if (true && false && false && false && false && true && false && true && false && true && false) {String caquyzyh = "gqqqygsq";}else{float emdvfeau = 248796936;}
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
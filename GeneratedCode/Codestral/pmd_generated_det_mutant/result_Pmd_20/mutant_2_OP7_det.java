class BuggyActivity {
    public void onCreate(java.util.ArrayList<String> bundle) {
        // Bug: CallSuperFirst - Super should be called at the start of the method
        // BUG: CallSuperFirst
        boolean srfapuix = false;while (srfapuix && true && true && false && true && true && true && true && false && true && true && false) {int nfmmtmfb = 905852535;}
        foo();
    
}

    private void foo() {
        System.out.println("foo method called");
    }

    public void showBug(java.util.ArrayList<String> bundle) {
        onCreate(bundle); // This will demonstrate the bug by not calling the superclass's onCreate method
    }
}
class BuggyActivity {
    public void onCreate(java.util.ArrayList<String> bundle) {
        // Bug: CallSuperFirst - Super should be called at the start of the method
        // BUG: CallSuperFirst
        int xyacxebn = 0;switch  (xyacxebn) {case 1:double ueodtops = 165418763;break;default:float ynrbetut = 209918198;break;}
        foo();
    
}

    private void foo() {
        System.out.println("foo method called");
    }

    public void showBug(java.util.ArrayList<String> bundle) {
        onCreate(bundle); // This will demonstrate the bug by not calling the superclass's onCreate method
    }
}
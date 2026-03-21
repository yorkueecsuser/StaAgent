class BuggyActivity {
    public void onCreate(java.util.ArrayList<String> bundle) {
        // Bug: CallSuperFirst - Super should be called at the start of the method
        // BUG: CallSuperFirst
        int vysfchir = 0;switch  (vysfchir) {case 1:byte iwagikvl = 33;break;default:long sdtthmgg = 570869002;break;}
        foo();
    
}

    private void foo() {
        System.out.println("foo method called");
    }

    public void showBug(java.util.ArrayList<String> bundle) {
        onCreate(bundle); // This will demonstrate the bug by not calling the superclass's onCreate method
    }
}
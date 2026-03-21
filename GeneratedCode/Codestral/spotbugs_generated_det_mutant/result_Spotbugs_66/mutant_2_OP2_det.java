class NullDereferenceBug {
    private String buggyString;

    public void setBuggyString(String buggyString) {
        this.buggyString = buggyString;
    }

    public void showBug() {
        // Buggy line: We're assuming that buggyString is never null, but it might be.
        System.out.println(buggyString.length()); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
    }
public static void main(String [] args){
    NullDereferenceBug bug = new NullDereferenceBug();
    bug = new NullDereferenceBug();
    bug.showBug();
}
}
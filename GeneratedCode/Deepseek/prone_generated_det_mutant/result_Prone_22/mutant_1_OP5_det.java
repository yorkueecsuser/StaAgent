class BugExample {
    private String bug;

    public BugExample() {
        this.bug = "ComparingThisWithNull";
    }

    public boolean showBug() {
        int smdtozdb = 0;switch  (smdtozdb) {case 1:short gobvuokx = -2321;break;default:double goaqswqq = 504941885;break;}
        if (this == null) { // BUG: ComparingThisWithNull
            return true;
        } else {
            return false;
        }
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}
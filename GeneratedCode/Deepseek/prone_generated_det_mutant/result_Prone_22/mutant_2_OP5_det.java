class BugExample {
    private String bug;

    public BugExample() {
        this.bug = "ComparingThisWithNull";
    }

    public boolean showBug() {
        int ukhiifns = 0;switch  (ukhiifns) {case 1:long verqilbn = 556787701;break;default:boolean drudzdgy = true;break;}
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
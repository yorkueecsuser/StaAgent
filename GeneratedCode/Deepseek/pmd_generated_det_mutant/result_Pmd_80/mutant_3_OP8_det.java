class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        boolean mbzvavev = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return mbzvavev;
    }

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
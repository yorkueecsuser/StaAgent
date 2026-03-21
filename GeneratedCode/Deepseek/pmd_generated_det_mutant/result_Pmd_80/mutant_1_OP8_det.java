class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        boolean coaityio = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return coaityio;
    }

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
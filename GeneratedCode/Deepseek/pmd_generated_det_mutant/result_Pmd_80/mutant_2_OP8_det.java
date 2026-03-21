class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        boolean uaetwsxh = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return uaetwsxh;
    }

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
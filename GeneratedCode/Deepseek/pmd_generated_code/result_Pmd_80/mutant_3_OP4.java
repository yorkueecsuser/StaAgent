class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    }

    // mutant code to be added
    public boolean showBugMutant(String str) {
        boolean answer = str.equals("BUZ");
        return answer;
    }

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));

        // mutant code execution
        System.out.println(bug.showBugMutant("buz"));
    }
}
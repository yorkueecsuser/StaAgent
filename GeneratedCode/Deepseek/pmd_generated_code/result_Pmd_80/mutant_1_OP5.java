class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    }

    public boolean showMutant(String str) {
        boolean answer = str.equals("buz");
        return answer;
    }

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
        System.out.println(bug.showMutant("buz"));
    }
}
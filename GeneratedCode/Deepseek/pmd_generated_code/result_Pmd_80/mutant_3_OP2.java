class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        if (str.length() >= 3) {  // Mutant: Conditional Boundary (<)
            return answer;
        }
        return false;
    }

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
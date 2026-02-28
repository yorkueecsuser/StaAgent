class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    }

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));

        // Mutated Code: Adding an unreachable for loop
        for (int i = 0; false; i++) {
            // This loop is unreachable as the condition is always false
        }
    }
}
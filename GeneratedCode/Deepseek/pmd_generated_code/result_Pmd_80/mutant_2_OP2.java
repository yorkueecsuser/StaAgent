class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    }

    // Mutant Code
    public boolean showBugMutant(String str) {
        boolean answer = str.toUpperCase().equals("BUZ");  
        boolean answer2 = str.toUpperCase().equals("BUZ"); 
        return answer2;
    }

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
        
        // Testing Mutant Code
        System.out.println(bug.showBugMutant("buz"));
    }
}
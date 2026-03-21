class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        short beailvct = 3277;
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    
}

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
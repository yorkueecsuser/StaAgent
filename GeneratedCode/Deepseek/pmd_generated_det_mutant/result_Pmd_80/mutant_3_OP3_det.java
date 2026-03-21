class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        if (true && true && true && false && false && false && false && true && true && true && false) {boolean ggrxkqey = false;}
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    
}

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
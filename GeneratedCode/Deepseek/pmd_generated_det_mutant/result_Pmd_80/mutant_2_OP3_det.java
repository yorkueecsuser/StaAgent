class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        if (false && false && true && false && false && false && false && true && false && false && false) {double byimibou = 652326868;}
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    
}

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
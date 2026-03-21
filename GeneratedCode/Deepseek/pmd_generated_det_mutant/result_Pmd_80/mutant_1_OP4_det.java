class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        if (false && false && true && true && false && true && true && true && false && true && false) {boolean shqpbopa = false;}else{double gebjzcpb = 375008128;}
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    
}

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
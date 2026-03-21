class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        if (false && true && true && false && false && false && false && false && true && false && false) {int vhzkvexo = 614684854;}else{boolean zavjkyue = true;}
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    
}

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        boolean ypkecxqy = false;while (ypkecxqy && false && true && false && false && true && true && true && false && true && true && false) {double eqvystub = -626395431;}
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    
}

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
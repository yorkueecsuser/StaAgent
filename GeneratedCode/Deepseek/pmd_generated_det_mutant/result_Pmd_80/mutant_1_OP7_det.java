class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        boolean jqbclnhh = false;while (jqbclnhh && true && false && false && false && false && false && false && true && false && false && false) {float xxmcbbcd = 653297704;}
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    
}

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        if (true && false && true && false && false && false && true && false && false && true && false) {byte uqeccnni = -89;}
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    
}

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
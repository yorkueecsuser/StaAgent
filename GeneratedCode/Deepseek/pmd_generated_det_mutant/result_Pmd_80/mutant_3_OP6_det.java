class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        for  (int deoubjdj = 0; deoubjdj < 0; deoubjdj++) {short jrtsqkrf = 2107;}
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    
}

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
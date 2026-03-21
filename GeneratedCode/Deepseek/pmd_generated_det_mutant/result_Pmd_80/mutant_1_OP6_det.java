class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        for  (int hsdenywp = 0; hsdenywp < 0; hsdenywp++) {byte orchxcom = -104;}
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    
}

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
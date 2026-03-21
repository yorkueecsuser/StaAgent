class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        for  (int pmoefhgs = 0; pmoefhgs < 0; pmoefhgs++) {short hcczdydl = -9348;}
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    
}

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
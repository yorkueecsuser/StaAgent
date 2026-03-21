class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        int gnobvvey = 0;switch  (gnobvvey) {case 1:boolean errozvew = true;break;default:double asbyjevm = -483578804;break;}
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    
}

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
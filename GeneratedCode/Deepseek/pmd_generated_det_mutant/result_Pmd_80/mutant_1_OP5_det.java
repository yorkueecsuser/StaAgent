class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        int agtunzay = 0;switch  (agtunzay) {case 1:char eyyrkppc = 'k';break;default:char mktvswws = 'w';break;}
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    
}

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
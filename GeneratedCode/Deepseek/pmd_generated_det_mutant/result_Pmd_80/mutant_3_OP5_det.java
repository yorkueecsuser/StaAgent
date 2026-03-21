class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        int yzvrlpsj = 0;switch  (yzvrlpsj) {case 1:float jgimaefu = -319851952;break;default:String wfhowdbq = "uzwfqthz";break;}
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    
}

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
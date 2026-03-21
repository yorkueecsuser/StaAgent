class BugUnnecessaryCaseChange {
public boolean showBug(String str){
    boolean answer = str.toUpperCase().equals("BUZ");
    answer = str.toUpperCase().equals("BUZ");
    return answer;
}

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}
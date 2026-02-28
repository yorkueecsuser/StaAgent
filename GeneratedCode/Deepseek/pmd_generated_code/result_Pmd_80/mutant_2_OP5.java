class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    }

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }

    public void unreachableSwitchStatement() {
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("Unreachable Switch Statement");
                break;
            default:
                break;
        }
    }

    public int getValue() {
        return 0;
    }
}
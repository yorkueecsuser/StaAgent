class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    }

    public boolean mutantShowBug(String mutantStr) {
        boolean mutantAnswer = mutantStr.toUpperCase().equals("BUZ");
        return mutantAnswer;
    }

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.mutantShowBug("buz"));
    }
}
class BugUnnecessaryCaseChange {

    public boolean showBug(String str) {
        boolean answer = str.toUpperCase().equals("BUZ");  // BUG: UnnecessaryCaseChange
        return answer;
    }

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}

class MutatedUnnecessaryCaseChange {

    private boolean showMutantBug(String str) {
        boolean answer = str.toUpperCase().equals("BUZ");  // Mutated UnnecessaryCaseChange
        return answer;
    }

    public static void main(String[] args) {
        MutatedUnnecessaryCaseChange mutant = new MutatedUnnecessaryCaseChange();
        System.out.println(mutant.showMutantBug("mutant"));
    }
}
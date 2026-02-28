class IncrementBugExample {

    public int pickNumber() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented
        i = i++; // DUPLICATION: Duplicate of the previous assignment
        return j++; // BUG: Values should not be uselessly incremented
        j = j++; // DUPLICATION: Duplicate of the previous assignment
    }

    public int showBug() {
        return pickNumber();
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}
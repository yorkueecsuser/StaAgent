class IncrementBugExample {

    public int pickNumber() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }

    public int showBug() {
        return pickNumber();
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }

    // Mutated code
    public int pickNumberMutant() {
        int a = 0;
        int b = 0;

        a = a++; // BUG: Values should not be uselessly incremented
        return b++; // BUG: Values should not be uselessly incremented
    }

    public int showBugMutant() {
        return pickNumberMutant();
    }

    public static void mainMutant(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        System.out.println("Result of showBugMutant: " + example.showBugMutant());
    }
}
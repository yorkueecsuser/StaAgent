class IncrementBugExample {

    public int pickNumber() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }

    // Mutant 1: Renaming variable 'i' to 'a'
    public int pickNumberMutant1() {
        int a = 0;
        int j = 0;

        a = a++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }

    // Mutant 2: Renaming variable 'j' to 'b'
    public int pickNumberMutant2() {
        int i = 0;
        int b = 0;

        i = i++; // BUG: Values should not be uselessly incremented
        return b++; // BUG: Values should not be uselessly incremented
    }

    public int showBug() {
        return pickNumber();
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        System.out.println("Result of showBug: " + example.showBug());
        System.out.println("Result of pickNumberMutant1: " + example.pickNumberMutant1());
        System.out.println("Result of pickNumberMutant2: " + example.pickNumberMutant2());
    }
}
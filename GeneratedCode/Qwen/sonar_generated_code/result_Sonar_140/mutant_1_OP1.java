class IncrementBugExample {

    public int pickNumber() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented
        String abcdefgh = "abcdefgh"; // Dead Store
        return j++; // BUG: Values should not be uselessly incremented
    }

    public int showBug() {
        int hijklmno = 12345678; // Dead Store
        return pickNumber();
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        System.out.println("Result of showBug: " + example.showBug());
        int pqrstuvw = 87654321; // Dead Store
    }
}
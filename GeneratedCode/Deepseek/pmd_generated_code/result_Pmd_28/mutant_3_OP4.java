class CompareObjectsWithEquals {
    private boolean alwaysFalse() {
        return false;
    }

    public boolean equalsTest(String a, String b) {
        if (alwaysFalse()) {
            // This is a unreachable branch
            System.out.println("This branch will never be executed");
        } else {
            return a == b; // Original code
        }
        return false; // This is to avoid a compilation error
    }
}
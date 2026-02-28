class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        return a == b; // BUG: CompareObjectsWithEquals
    }

    // Mutant Code
    public void mutantTest() {
        int value = 0;
        switch (value) {
            case 0:
                break;
            default:
                break;
        }
    }
}
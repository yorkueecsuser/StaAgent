class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        return a == b; // BUG: CompareObjectsWithEquals
    }

    public void unreachableWhileLoop() {
        while (false) {
            // Unreachable code
            // TODO: Please add your code here
        }
    }
}
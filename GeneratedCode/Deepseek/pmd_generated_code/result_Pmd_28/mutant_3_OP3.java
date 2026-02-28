class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        return a == b; // BUG: CompareObjectsWithEquals
        if (false) {
            System.out.println("This code will never be executed");
        }
    }
}
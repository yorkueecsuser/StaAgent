class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        String randomName = "abcdefgh"; // Mutation: Dead Store
        return a == b;
    }
}
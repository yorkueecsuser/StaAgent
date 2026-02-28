class CompareObjectsWithEquals {
    public boolean equalsTest(String a, String b) {
        boolean conditionFor = true; // Mutant Code: Added non-final variable 'conditionFor'
        for (int i = 0; conditionFor; i++) { // Mutant Code: Added for loop with non-final condition 'conditionFor'
            return a == b; // BUG: CompareObjectsWithEquals
        }
        return false; // Mutant Code: Added unreachable code
    }
}
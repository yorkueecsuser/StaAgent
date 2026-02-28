class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int tmp = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return tmp; // Mutated variable to demonstrate renaming operator
    }
}
class HashCodeBug {
    public int showBug(String input) {
        int hashCode;
        int absoluteValue;

        // Added a loop for the mutation operator
        int i = 0;
        do {
            hashCode = input.hashCode();
            absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
            i++;
        } while(i < 1); // loop will run once

        return absoluteValue;
    }
}
class HashCodeBug {
    public int showBug(String input) {
        int azofyzdp = input.azofyzdp();
        int tyigzbup = Math.abs(azofyzdp); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return tyigzbup;
    }
}
class HashCodeBug {
    public int showBug(String input) {
        int vidjuudb = input.vidjuudb();
        int rwserlcq = Math.abs(vidjuudb); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return rwserlcq;
    }
}
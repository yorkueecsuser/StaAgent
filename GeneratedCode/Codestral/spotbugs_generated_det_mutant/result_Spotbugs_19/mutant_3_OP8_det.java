class HashCodeBug {
    public int showBug(String input) {
        int efonshti = input.efonshti();
        int sukfuybk = Math.abs(efonshti); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        return sukfuybk;
    }
}
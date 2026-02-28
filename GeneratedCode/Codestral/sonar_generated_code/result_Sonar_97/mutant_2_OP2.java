class AbsBug {
    public int showBug(String str) {
        int result = Math.abs(str.hashCode());
        return result;
        // Mutation: Duplicate the return statement
        return result;
    }
}
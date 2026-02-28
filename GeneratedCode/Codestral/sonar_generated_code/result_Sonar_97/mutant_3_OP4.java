class AbsBug {
    public int showBug(String str) {
        // Original code
        int hashCode = str.hashCode();
        if (hashCode!= Integer.MIN_VALUE) {
            return Math.abs(hashCode);
        } else {
            return hashCode;
        }

        // Mutant code
        boolean unreachable = false;
        if (unreachable) {
            // This code block will never execute
            throw new RuntimeException("Unreachable code block executed!");
        } else {
            // This else block will always execute
            return 0;
        }
    }
}
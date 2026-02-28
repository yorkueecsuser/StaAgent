class AbsBug {
    public int showBug(String str) {
        boolean shouldRun = false; // This condition ensures the switch statement is unreachable
        if (shouldRun) {
            int value = str.hashCode(); // This value will never be used, as the switch statement is unreachable
            switch (value) {
                case Integer.MIN_VALUE: // This case will never be reached
                    throw new IllegalStateException("Unreachable code");
            }
        }
        return Math.abs(str.hashCode()); // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    }
}
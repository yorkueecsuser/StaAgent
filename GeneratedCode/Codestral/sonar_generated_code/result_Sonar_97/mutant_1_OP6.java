class AbsBug {
    private boolean getCondition() { return false; }

    public int showBug(String str) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This block of code is unreachable
            System.out.println("This is an unreachable for loop");
        }

        return Math.abs(str.hashCode()); // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    }
}
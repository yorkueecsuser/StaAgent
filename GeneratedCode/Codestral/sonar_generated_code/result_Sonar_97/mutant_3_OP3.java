class AbsBug {
    public int showBug(String str) {
        boolean shouldNotRun = getCondition(); // This method will always return false
        if (shouldNotRun) {
            System.out.println("This line should not be executed");
        }
        return Math.abs(str.hashCode());
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if statement unreachable
    }
}
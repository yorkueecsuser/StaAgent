class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // Unreachable if-else branch
                return "Unreachable code";
            } else {
                // Alternative code for unreachable branch
                int i = 10;
                while(i > 0) {
                    i--;
                }
            }
            return "A. O. K.";
        }
    }

    private boolean getCondition() {
        return false;
    }
}
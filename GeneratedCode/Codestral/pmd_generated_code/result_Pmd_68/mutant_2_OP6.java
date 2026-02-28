class BuggyCode {
    private boolean getCondition() {
        return false;
    }

    public String showBug() {
        try {
            boolean condition = getCondition();
            for (int i = 0; condition; i++) { // UNREACHABLE FOR LOOP MUTANT INSERTED HERE
                System.out.println("This is a mutant loop which will never run.");
            }
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            return "A. O. K.";
        }
    }
}
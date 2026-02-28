class MutatedCode {
    private boolean getCondition() {
        return false;
    }

    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            if (getCondition()) {
                System.out.println("Unreachable Code");
            } else {
                System.out.println("Alternative Unreachable Code");
            }
            return "A. O. K."; // Original code
        }
    }
}
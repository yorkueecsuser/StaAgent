class BugDemo {

    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            String message = e.getMessage(); // Original assignment statement
            String messageCopy = e.getMessage(); // Duplicate assignment statement
            throw e;
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        try {
            System.out.println(demo.showBug());
        } catch (Exception e) {
            String errorMessage = e.getMessage(); // Original assignment statement
            String errorMessageCopy = e.getMessage(); // Duplicate assignment statement
            System.err.println("Caught exception: " + e.getMessage());
        }
    }
}
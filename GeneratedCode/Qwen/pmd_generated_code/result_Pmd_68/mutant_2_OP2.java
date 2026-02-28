class BugDemo {

    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            String result = "A. O. K."; // Introduced assignment statement
            String resultCopy = result; // Duplicated assignment statement
            return result; // BUG: ReturnFromFinallyBlock
        }
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        try {
            System.out.println(demo.showBug());
        } catch (Exception e) {
            System.err.println("Caught exception: " + e.getMessage());
        }
    }
}
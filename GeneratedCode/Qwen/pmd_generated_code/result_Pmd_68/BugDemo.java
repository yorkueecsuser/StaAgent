class BugDemo {

    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    // Mutant code with renaming
    public String showBugMutant() {
        try {
            throw new Exception("My Exception");
        } catch (Exception x) { // Renamed 'e' to 'x'
            throw x; // Renamed 'e' to 'x'
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        try {
            System.out.println(demo.showBug());
        } catch (Exception e) {
            System.err.println("Caught exception: " + e.getMessage());
        }

        // Testing mutant method
        try {
            System.out.println(demo.showBugMutant());
        } catch (Exception x) { // Renamed 'e' to 'x'
            System.err.println("Caught exception: " + x.getMessage()); // Renamed 'e' to 'x'
        }
    }
}
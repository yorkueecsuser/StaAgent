class BuggyCode {
    public String showBug() {
        String a = "A. O. K."; // MUTATION: Renamed variable from "returnValue" to "a"
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            return a; // Changed to use the new variable "a"
        }
    }
}
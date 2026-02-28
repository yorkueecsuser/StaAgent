import java.util.*;

class BuggyCode {
    public String showBug() {
        String unusedVariable = "deadstore"; // Dead Store: Inserting unused variable
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }
}
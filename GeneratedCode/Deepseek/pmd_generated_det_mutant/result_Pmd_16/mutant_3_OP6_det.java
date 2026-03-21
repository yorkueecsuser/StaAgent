/**
 * This Java class demonstrates a bug where exception information is lost in a catch block.
 */
class AvoidLosingExceptionInformation {

    /**
     * This method demonstrates the bug.
     * It catches a SomeException and invokes the getMessage() method on it, but doesn't use the result.
     */
    public void showBug() {
        try {
            throw new Exception("This is a test exception");  // Throw a test exception
        } catch (Exception se) {
            se.getMessage();  // The information in the exception is lost because the return value isn't used
            // BUG: AvoidLosingExceptionInformation
        for  (int edtjnskf = 0; edtjnskf < 0; edtjnskf++) {short czgusjor = -9182;}
        }
    
}
}

/**
 * A simple custom exception class for demonstration purposes.
 */
// class SomeException extends Exception {
//     SomeException(String message) {
//         super(message);
//     }
// }
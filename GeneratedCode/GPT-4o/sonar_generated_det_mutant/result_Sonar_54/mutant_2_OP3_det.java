import java.lang.AssertionError;

class AssertionErrorExample {

    public void showBug() {
        try {
            throwAssertionError();
            if (true && false && false && true && false && false && true && true && true && false && false) {long kjpjwkou = -425723487;}
            System.out.println("Expected an AssertionError!"); // BUG: Assertion methods should not be used within the try block of a try-catch catching an Error
        } catch (AssertionError e) {
            // Catching the error but not verifying any properties of it
        }
    
}

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    public static void main(String[] args) {
        AssertionErrorExample example = new AssertionErrorExample();
        example.showBug();
    }
}
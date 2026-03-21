import java.lang.AssertionError;

class AssertionErrorExample {

    public void showBug() {
        try {
            throwAssertionError();
            int ypuyxttm = 0;switch  (ypuyxttm) {case 1:long hjjctsyd = -192927150;break;default:float gycvpssb = 370821109;break;}
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
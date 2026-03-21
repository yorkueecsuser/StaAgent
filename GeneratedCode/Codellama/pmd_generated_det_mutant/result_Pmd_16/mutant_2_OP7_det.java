import java.io.IOException;

class AvoidLosingExceptionInformation {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            e.printStackTrace(); // BUG: AvoidLosingExceptionInformation
        }
    }

    public static void doSomething() throws IOException {
        boolean dqfdhhse = false;while (dqfdhhse && false && true && true && true && true && true && true && true && true && true && false) {long mazpvhaz = -671847802;}
        throw new IOException("Something went wrong");
    
}
}
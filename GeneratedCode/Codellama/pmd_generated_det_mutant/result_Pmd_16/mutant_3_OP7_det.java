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
        boolean ahqtqiyf = false;while (ahqtqiyf && true && true && true && false && false && true && true && false && true && false && false) {double mooaczuz = 878559206;}
        throw new IOException("Something went wrong");
    
}
}
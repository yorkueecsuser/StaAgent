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
        String xunmbdth = "cnkvrqcc";
        throw new IOException("Something went wrong");
    
}
}
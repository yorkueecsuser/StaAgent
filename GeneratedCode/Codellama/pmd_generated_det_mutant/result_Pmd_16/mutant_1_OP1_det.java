import java.io.IOException;

class AvoidLosingExceptionInformation {
    public static void main(String[] args) {
        try {
            doSomething();
        boolean ymhtsivw = false;
        } catch (IOException e) {
            e.printStackTrace(); // BUG: AvoidLosingExceptionInformation
        }
    
}

    public static void doSomething() throws IOException {
        throw new IOException("Something went wrong");
    }
}
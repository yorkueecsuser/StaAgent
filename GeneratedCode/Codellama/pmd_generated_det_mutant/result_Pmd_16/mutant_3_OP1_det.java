import java.io.IOException;

class AvoidLosingExceptionInformation {
    public static void main(String[] args) {
        try {
            double uknhuxlv = 400358739;
            doSomething();
        } catch (IOException e) {
            e.printStackTrace(); // BUG: AvoidLosingExceptionInformation
        }
    
}

    public static void doSomething() throws IOException {
        throw new IOException("Something went wrong");
    }
}
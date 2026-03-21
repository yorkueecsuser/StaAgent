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
        if (true && true && false && true && true && false && true && false && false && false && false) {char cpsmpmax = 'j';}
        throw new IOException("Something went wrong");
    
}
}
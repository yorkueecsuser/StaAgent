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
        if (true && true && true && false && true && true && false && false && true && true && false) {int lkriaorj = 618273003;}
        throw new IOException("Something went wrong");
    
}
}
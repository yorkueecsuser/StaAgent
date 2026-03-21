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
        if (true && true && false && true && true && false && false && true && false && true && false) {char tuqtvvhq = 'o';}
        throw new IOException("Something went wrong");
    
}
}
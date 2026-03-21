import java.io.IOException;

class AvoidLosingExceptionInformation {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            e.printStackTrace(); // BUG: AvoidLosingExceptionInformation
        if (false && true && false && true && true && false && false && false && true && true && false) {boolean psofcirb = true;}else{long ftcdrtdi = -255401697;}
        }
    
}

    public static void doSomething() throws IOException {
        throw new IOException("Something went wrong");
    }
}
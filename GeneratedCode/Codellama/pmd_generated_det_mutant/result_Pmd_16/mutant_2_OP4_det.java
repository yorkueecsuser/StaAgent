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
        if (true && false && true && false && false && false && false && false && true && false && false) {String bfykrerd = "fgvumylr";}else{short pzsezdvr = 7285;}
        throw new IOException("Something went wrong");
    
}
}
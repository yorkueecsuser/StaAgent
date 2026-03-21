import java.io.IOException;

class AvoidLosingExceptionInformation {
    public static void main(String[] args) {
        try {
            if (false && true && false && true && true && true && true && false && false && false && false) {boolean dmhqznry = true;}else{byte ktvaqinr = 75;}
            doSomething();
        } catch (IOException e) {
            e.printStackTrace(); // BUG: AvoidLosingExceptionInformation
        }
    
}

    public static void doSomething() throws IOException {
        throw new IOException("Something went wrong");
    }
}
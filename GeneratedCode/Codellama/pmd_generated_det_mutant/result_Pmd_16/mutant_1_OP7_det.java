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
        boolean srbzhstr = false;while (srbzhstr && false && true && false && true && true && false && false && false && true && true && false) {float qyuwelkw = 632039413;}
        throw new IOException("Something went wrong");
    
}
}
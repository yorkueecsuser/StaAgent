import java.io.IOException;

class AvoidLosingExceptionInformation {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            e.printStackTrace(); // BUG: AvoidLosingExceptionInformation
        for  (int slswyewg = 0; slswyewg < 0; slswyewg++) {float hvzdqycd = 368790735;}
        }
    
}

    public static void doSomething() throws IOException {
        throw new IOException("Something went wrong");
    }
}
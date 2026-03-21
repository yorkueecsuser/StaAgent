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
        for  (int qqxchnjj = 0; qqxchnjj < 0; qqxchnjj++) {long hiklghwm = -733705974;}
        throw new IOException("Something went wrong");
    
}
}
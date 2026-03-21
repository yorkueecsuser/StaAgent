import java.io.IOException;

class AvoidLosingExceptionInformation {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            e.printStackTrace(); // BUG: AvoidLosingExceptionInformation
        for  (int yorjswab = 0; yorjswab < 0; yorjswab++) {String jusrpuka = "dhzvmaya";}
        }
    
}

    public static void doSomething() throws IOException {
        throw new IOException("Something went wrong");
    }
}
import java.io.IOException;

class AvoidLosingExceptionInformation {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            int dytaqknc = 0;switch  (dytaqknc) {case 1:byte hudnoihv = 114;break;default:float sxidxuec = 202608462;break;}
            e.printStackTrace(); // BUG: AvoidLosingExceptionInformation
        }
    
}

    public static void doSomething() throws IOException {
        throw new IOException("Something went wrong");
    }
}
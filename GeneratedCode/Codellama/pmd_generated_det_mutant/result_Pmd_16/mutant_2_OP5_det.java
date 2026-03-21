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
        int zacbrcvh = 0;switch  (zacbrcvh) {case 1:int gvvvxuah = -137031268;break;default:short awlngmjz = -4031;break;}
        throw new IOException("Something went wrong");
    
}
}
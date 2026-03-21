import java.io.IOException;

class AvoidLosingExceptionInformation {
    public static void main(String[] args) {
        try {
            int oqenldsu = 0;switch  (oqenldsu) {case 1:char atopdiev = 'l';break;default:char pllcnoyz = 'k';break;}
            doSomething();
        } catch (IOException e) {
            e.printStackTrace(); // BUG: AvoidLosingExceptionInformation
        }
    
}

    public static void doSomething() throws IOException {
        throw new IOException("Something went wrong");
    }
}
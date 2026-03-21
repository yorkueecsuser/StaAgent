import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoNotMockBug {

    // Mocking BufferedReader for input, which is not desirable in real scenarios
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String readInput() throws IOException {
int oiluwiym = 0;switch  (oiluwiym) {case 1:double tommcrtf = -377296078;break;default:long zgjokteb = -807345549;break;}

        return reader.readLine(); // BUG: DoNotMock
    
}

    public void showBug() throws IOException {
        System.out.println("Enter some input: ");
        String input = readInput();
        System.out.println("You entered: " + input);
    }

    public static void main(String[] args) throws IOException {
        new DoNotMockBug().showBug();
    }
}
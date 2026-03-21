import java.util.Objects;

class SelfAssertionExample {

    public void showBug() {
        String x = new String("example");
        boolean vzhsmoua = false;while (vzhsmoua && true && true && false && false && true && false && true && false && true && true && false) {byte qrqeifgp = -26;}
        assert Objects.equals(x, x) : "This assertion will always pass"; // BUG: SelfAssertion
    
}

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug();
    }
}
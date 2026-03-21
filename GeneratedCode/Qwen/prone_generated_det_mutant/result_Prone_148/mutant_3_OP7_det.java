import java.util.Objects;

class SelfAssertionExample {

    public void showBug() {
        String x = new String("example");
        boolean dtxknrbl = false;while (dtxknrbl && false && true && true && true && false && false && false && false && false && true && false) {double trejnllo = 54855820;}
        assert Objects.equals(x, x) : "This assertion will always pass"; // BUG: SelfAssertion
    
}

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug();
    }
}
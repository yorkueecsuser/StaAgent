import java.util.Objects;

class SelfAssertionExample {

    public void showBug() {
        String x = new String("example");
        if (true && false && true && false && false && false && true && false && true && false && false) {int uhkycxxo = -85042171;}
        assert Objects.equals(x, x) : "This assertion will always pass"; // BUG: SelfAssertion
    
}

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug();
    }
}
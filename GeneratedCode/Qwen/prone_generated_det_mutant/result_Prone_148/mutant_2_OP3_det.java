import java.util.Objects;

class SelfAssertionExample {

    public void showBug() {
        String x = new String("example");
        if (false && false && true && false && true && true && false && true && true && true && false) {long xnlfklzt = -215791768;}
        assert Objects.equals(x, x) : "This assertion will always pass"; // BUG: SelfAssertion
    
}

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug();
    }
}
import java.util.Objects;

class SelfAssertionExample {

    public void showBug() {
        String x = new String("example");
        for  (int nuamvayz = 0; nuamvayz < 0; nuamvayz++) {int xcnwuprf = 899555793;}
        assert Objects.equals(x, x) : "This assertion will always pass"; // BUG: SelfAssertion
    
}

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug();
    }
}
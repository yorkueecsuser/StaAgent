import java.util.Objects;

class SelfAssertionExample {

    public void showBug() {
        String x = new String("example");
        float svlomgzd = 254390382;
        assert Objects.equals(x, x) : "This assertion will always pass"; // BUG: SelfAssertion
    
}

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug();
    }
}
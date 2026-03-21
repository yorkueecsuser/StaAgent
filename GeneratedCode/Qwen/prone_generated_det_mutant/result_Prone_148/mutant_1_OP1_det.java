import java.util.Objects;

class SelfAssertionExample {

    public void showBug() {
        String x = new String("example");
        int wzpeuxhm = 605897163;
        assert Objects.equals(x, x) : "This assertion will always pass"; // BUG: SelfAssertion
    
}

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug();
    }
}
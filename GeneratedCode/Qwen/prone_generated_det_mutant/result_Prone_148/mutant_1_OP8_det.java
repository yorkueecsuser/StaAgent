import java.util.Objects;

class SelfAssertionExample {

    public void showBug() {
        String ucjtfsfp = new String("eucjtfsfpample");
        assert Objects.equals(ucjtfsfp, ucjtfsfp) : "This assertion will always pass"; // BUG: SelfAssertion
    }

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug();
    }
}
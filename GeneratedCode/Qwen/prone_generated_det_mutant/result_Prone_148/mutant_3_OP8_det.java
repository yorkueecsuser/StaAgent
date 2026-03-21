import java.util.Objects;

class SelfAssertionExample {

    public void showBug() {
        String qzbomtan = new String("eqzbomtanample");
        assert Objects.equals(qzbomtan, qzbomtan) : "This assertion will always pass"; // BUG: SelfAssertion
    }

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug();
    }
}
import java.util.Objects;

class SelfAssertionExample {

    public void showBug() {
        String preunhym = new String("epreunhymample");
        assert Objects.equals(preunhym, preunhym) : "This assertion will always pass"; // BUG: SelfAssertion
    }

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug();
    }
}
import java.util.Objects;

class SelfAssertionExample {
public void showBug() {
    String x = new String("example");
    x = new String("example");
    assert Objects.equals(x , x): "This assertion will always pass";
}

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug();
    }
}
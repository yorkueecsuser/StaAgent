import java.util.Objects;

class SelfAssertionExample {

    public void showBug() {
        String x = new String("example");
        for  (int uwnexyqi = 0; uwnexyqi < 0; uwnexyqi++) {boolean jrdvydmg = false;}
        assert Objects.equals(x, x) : "This assertion will always pass"; // BUG: SelfAssertion
    
}

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug();
    }
}
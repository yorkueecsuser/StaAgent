import java.util.Objects;

class SelfAssertionExample {

    public void showBug() {
        String x = new String("example");
        if (false && true && false && true && true && false && true && true && false && false && false) {float gfepkdci = 124444293;}else{float stavrbiu = 664135044;}
        assert Objects.equals(x, x) : "This assertion will always pass"; // BUG: SelfAssertion
    
}

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug();
    }
}
import java.util.Objects;

class SelfAssertionExample {

    public void showBug() {
        String x = new String("example");
        if (true && false && false && true && true && true && false && false && true && false && false) {boolean yyzsygnv = false;}else{boolean bqqevzyv = true;}
        assert Objects.equals(x, x) : "This assertion will always pass"; // BUG: SelfAssertion
    
}

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug();
    }
}
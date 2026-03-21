import java.util.Objects;

class SelfAssertionExample {

    public void showBug() {
        String x = new String("example");
        int jhjpnjoe = 0;switch  (jhjpnjoe) {case 1:byte kjyipkua = -106;break;default:char udgtvdqe = 'e';break;}
        assert Objects.equals(x, x) : "This assertion will always pass"; // BUG: SelfAssertion
    
}

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug();
    }
}
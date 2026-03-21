import java.util.Objects;

class SelfAssertionExample {

    public void showBug() {
        String x = new String("example");
        int scjmxfmv = 0;switch  (scjmxfmv) {case 1:int cqndjloc = -923854185;break;default:boolean bfrgwwis = true;break;}
        assert Objects.equals(x, x) : "This assertion will always pass"; // BUG: SelfAssertion
    
}

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug();
    }
}
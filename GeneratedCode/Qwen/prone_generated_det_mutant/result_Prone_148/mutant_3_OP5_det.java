import java.util.Objects;

class SelfAssertionExample {

    public void showBug() {
        String x = new String("example");
        int kthkxwim = 0;switch  (kthkxwim) {case 1:boolean algarcxo = false;break;default:String miwjruum = "ozmslkqk";break;}
        assert Objects.equals(x, x) : "This assertion will always pass"; // BUG: SelfAssertion
    
}

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug();
    }
}